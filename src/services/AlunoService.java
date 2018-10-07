package services;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import ControlLer.MenuAluno;
import ControlLer.MenuPrincipal;
import Models.Aluno;
import Models.Curso;
import Models.Disciplina;
import Models.Professor;
import dao.AlunoDAO;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import enumsModels.CategoriaProfessor;
import enumsModels.Situacao;

public class AlunoService {
	
	AlunoDAO alunoDAO = new AlunoDAO();
	DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	CursoDAO cursoDao = new CursoDAO();
	
	Scanner ler = new Scanner(System.in);

	public void addAluno() {
		
		// Adiciona professor
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("CPF: ");
		String cpf = ler.nextLine();
		System.out.print("Endereco: ");
		String endereco = ler.nextLine();
		System.out.print("e-mail: ");
		String email = ler.nextLine();
		System.out.print("Telefone: ");
		long telefone = ler.nextLong();
		
		List<Curso> listaCurso = cursoDao.select();
		
		System.out.println("Escolha o curso:");
		listaCurso.forEach(curso -> {
			System.out.println("Codigo: "+ curso.getCodigo() + " Nome: " + curso.getNome());
		});
		
		String curso = "";
		Aluno a = new Aluno();
		Curso cur = new Curso();
		do {
			System.out.println("Digite o codigo do curso:");
			curso = ler.nextLine();
			
			cur = cursoDao.select(curso);
			if(cur != null) {
				a.setCurso(cur);
			}
		} while(cur == null);
		
		String matricula = String.valueOf(a.getCurso().getCodigo()) 
				+ cpf.substring(cpf.length()-4) 
				+ String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
		
		List<Disciplina> listaDisciplina = disciplinaDao.select();
		
		System.out.println("Escolha as disciplinas:");
		listaDisciplina.forEach(disciplina -> {
			System.out.println("Codigo: "+ disciplina.getCodigoDisciplina() + " Nome: " + disciplina.getNomeDisciplina());
		});
		
		String disciplina = "";
		do {
			System.out.println("Digite o codigo da disciplina:");
			System.out.println("Caso tenha inserido todas ou queira inserir depois digite q");
			disciplina = ler.nextLine();
			Disciplina dis = disciplinaDao.select(disciplina);
			if(dis != null)
				a.getDisciplinaAluno().add(dis);
		} while(!disciplina.equals("q"));
		
		Situacao situacao = null;
		if(a.getDisciplinaAluno() != null) {
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
		
		alunoDAO.insert(a);
		
		System.out.println("Aluno Cadastrado!!!");
		System.out.println("\nContinuar em operações para alunos?");
		System.out.println("(1) SIM\n(2) NÂO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}

	public void readAluno() {
		String matricula = "";
		System.out.println("Digite a matricula para pesquisar um aluno: ");
		matricula = ler.nextLine();
		
		Aluno aluno = alunoDAO.select(matricula);
		if(aluno != null) {
			System.out.println("Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + 
			"\nEndereco: " + aluno.getEndereco() + "\nEmail: " + aluno.getEmail() + 
			"\nTelefone: " + aluno.getTelefone() + "\nSituacao: " + aluno.getSituacao() +
			"\nDisciplina: " + aluno.getDisciplinaAluno());
		}
	}

	public void updateAluno() {
		String matricula = "";
		System.out.println("Digite a matricula para editar um aluno: ");
		matricula = ler.nextLine();
		Aluno aluno = alunoDAO.select(matricula);
		if(aluno != null) {
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("CPF: ");
			String cpf = ler.nextLine();
			System.out.print("Endereco: ");
			String endereco = ler.nextLine();
			System.out.print("e-mail: ");
			String email = ler.nextLine();
			System.out.print("Telefone: ");
			long telefone = ler.nextLong();
			
			CategoriaProfessor categoria = null;
			
			int opCategoria= 0;
			do {
				System.out.println("Categoria: ");
				System.out.println("1_ Epsecialista /t 2_Mestre /t 3_Doutor");
				opCategoria = ler.nextInt();
				
				switch (opCategoria) {
				case 1: {
					categoria = CategoriaProfessor.ESPECIALISTA;
					break;
				}
				case 2: {
					categoria = CategoriaProfessor.MESTRE;
					break;
				}
				case 3: {
					categoria = CategoriaProfessor.DOUTOR;
					break;
				}
				default:
					System.out.println("\nEscolha uma opção válida");
					break;
				}

			} while (opCategoria < 1 || opCategoria > 3);
			
			List<Disciplina> listaDisciplina = disciplinaDao.select();
			
			System.out.println("Escolha as disciplinas:");
			listaDisciplina.forEach(d -> {
				System.out.println("Codigo: "+ d.getCodigoDisciplina() + " nome: " + d.getNomeDisciplina());
			});
			
			String disciplina = "";
			Professor p = new Professor();
			do {
				System.out.println("Digite o codigo da disciplina:");
				System.out.println("Caso tenha inserido todas digite q");
				disciplina = ler.nextLine();
				Disciplina disciplinaProfessor = disciplinaDao.select(disciplina);
				if(disciplinaProfessor != null)
					p.getDisciplinaProfessor().add(disciplinaProfessor);
			} while(!disciplina.equals("q"));
			
			p.setNome(nome);
			p.setCpf(cpf);
			p.setEndereco(endereco);
			p.setEmail(email);
			p.setTelefone(telefone);
			p.setCategoria(categoria);
			
			professorDao.update(p);
		}
	}

	public void deleteAluno() {
		do {
			String cpf = "";
			System.out.println("Digite o CPF deletar um professor: ");
			cpf = ler.nextLine();
			Professor professor = professorDao.select(cpf);
			if(professor != null) {
				professorDao.delete(professor);
			}
		} while(false);
	}
}
