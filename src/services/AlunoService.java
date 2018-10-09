package services;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import controlLer.MenuAluno;
import controlLer.MenuPrincipal;
import dao.AlunoDAO;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import enumsModels.Situacao;
import models.Aluno;
import models.Curso;
import models.Disciplina;

public class AlunoService {

	AlunoDAO alunoDao = new AlunoDAO();
	DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	CursoDAO cursoDao = new CursoDAO();
	Aluno a = new Aluno();

	Scanner ler = new Scanner(System.in);

	// Método para Adicionar aluno
	public void addAluno() {

		System.out.print("Nome: ");
		String nome = ler.nextLine();

		String cpf = "";
		do {
			System.out.print("CPF(apenas 11 digitos): ");
			cpf = ler.nextLine();
		} while (cpf.length() != 11);

		System.out.print("Endereco: ");
		String endereco = ler.nextLine();
		System.out.print("E-mail: ");
		String email = ler.nextLine();

		String str = "";
		long telefone = 0;
		do {
			System.out.print("Telefone: ");
			telefone = ler.nextLong();
			str = Long.toString(telefone);
		} while (str.length() < 8 || str.length() > 9);

		cursoAluno();

		String matricula = String.valueOf(a.getCurso().getCodigo()) + cpf.substring(cpf.length() - 4)
				+ String.valueOf(Calendar.getInstance().get(Calendar.YEAR));

		disciplinaAluno();

		Situacao situacao = null;
		if (a.getDisciplinaAluno() != null) {
			situacao = Situacao.MATRICULADO;
		} else {
			situacao = Situacao.PENDENTE;
		}

		a.setMatricula(matricula);
		a.setNome(nome);
		a.setCpf(cpf);
		a.setEndereco(endereco);
		a.setEmail(email);
		a.setTelefone(telefone);
		a.setSituacao(situacao);

		alunoDao.insert(a);

		System.out.println("Aluno Cadastrado!!!");
		System.out.println("\nContinuar em operacoes para alunos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para adicionar disciplinas ao aluno
	private void disciplinaAluno() {
		List<Disciplina> listaDisciplina = disciplinaDao.select();

		System.out.println("Escolha as disciplinas:");
		listaDisciplina.forEach(disciplina -> {
			System.out.println(
					"Codigo: " + disciplina.getCodigoDisciplina() + " Nome: " + disciplina.getNomeDisciplina());
		});

		String disciplina = "";
		int contador = 0;
		do {
			System.out.println("Digite o codigo da disciplina:");
			System.out.println("Caso tenha inserido todas ou queira inserir depois digite q");
			disciplina = ler.nextLine();
			Disciplina dis = disciplinaDao.select(disciplina);
			if (dis != null) {
				a.getDisciplinaAluno().add(dis);
				contador++;
			}
		} while (!disciplina.equals("q") || contador == 6);
	}

	// Metodo para adicionar o curso do aluno
	public void cursoAluno() {
		List<Curso> listaCurso = cursoDao.select();

		System.out.println("Escolha o curso:");
		listaCurso.forEach(curso -> {
			System.out.println("Codigo: " + curso.getCodigo() + " Nome: " + curso.getNome());
		});

		String curso = "";
		Curso cur = new Curso();
		do {
			System.out.println("Digite o codigo do curso:");
			curso = ler.nextLine();

			cur = cursoDao.select(curso);
			if (cur != null) {
				a.setCurso(cur);
			}
		} while (cur == null);
	}

	// Metodo para pesquisar aluno
	public void readAluno() {
		String matricula = "";
		System.out.println("Digite a matricula para pesquisar um aluno: ");
		matricula = ler.nextLine();

		Aluno aluno = alunoDao.select(matricula);
		if (aluno != null) {
			System.out.println("Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + "\nEndereco: "
					+ aluno.getEndereco() + "\nEmail: " + aluno.getEmail() + "\nTelefone: " + aluno.getTelefone()
					+ "\nSituacao: " + aluno.getSituacao() + "\nDisciplina: " + aluno.getDisciplinaAluno());
		}
		
		System.out.println("Aluno Pesquisado!!!");
		System.out.println("\nContinuar em operacoes para alunos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para atualizar aluno
	public void updateAluno() {
		String matricula = "";
		System.out.println("Digite a matricula para editar um aluno: ");
		matricula = ler.nextLine();
		Aluno aluno = alunoDao.select(matricula);
		if (aluno != null) {
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("CPF: ");
			String cpf = ler.nextLine();
			System.out.print("Endereco: ");
			String endereco = ler.nextLine();
			System.out.print("E-mail: ");
			String email = ler.nextLine();
			System.out.print("Telefone: ");
			long telefone = ler.nextLong();

			cursoAluno();

			disciplinaAluno();

			Situacao situacao = null;
			if (a.getDisciplinaAluno() != null) {
				situacao = Situacao.MATRICULADO;
			} else {
				situacao = Situacao.PENDENTE;
			}

			a.setMatricula(matricula);
			a.setNome(nome);
			a.setCpf(cpf);
			a.setEndereco(endereco);
			a.setEmail(email);
			a.setTelefone(telefone);
			a.setSituacao(situacao);

			alunoDao.update(a);
		}
		
		System.out.println("Aluno Atualizado!!!");
		System.out.println("\nContinuar em operacoes para alunos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para deletar aluno
	public void deleteAluno() {
		Aluno aluno = new Aluno();
		do {
			String matricula = "";
			System.out.println("Digite a matricula para deletar um aluno: ");
			matricula = ler.nextLine();
			aluno = alunoDao.select(matricula);
			if (aluno != null) {
				alunoDao.delete(aluno);
			}
		} while (aluno == null);
		
		System.out.println("Aluno Deletado!!!");
		System.out.println("\nContinuar em operacoes para alunos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	// Metodo para listar todos alunos
	public void listAluno() {
		List<Aluno> listaAlunos = alunoDao.select();

		System.out.println("###### LISTA DE TODOS OS ALUNOS ######");
		listaAlunos.forEach(aluno -> {
			System.out.println("Matricula: " + aluno.getMatricula() + " Nome: " + aluno.getNome());
		});
	}
}