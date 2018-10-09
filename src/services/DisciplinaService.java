package services;

import java.util.List;
import java.util.Scanner;

import controlLer.MenuAluno;
import controlLer.MenuPrincipal;
import dao.AlunoDAO;
import dao.DisciplinaDAO;
import dao.ProfessorDAO;
import enumsModels.CategoriaProfessor;
import models.Aluno;
import models.Disciplina;
import models.Professor;

public class DisciplinaService {
	
	private ProfessorDAO professorDao = new ProfessorDAO();
	private AlunoDAO alunoDao = new AlunoDAO();
	private DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	private Disciplina d = new Disciplina();
	private Scanner ler = new Scanner(System.in);

	// Metodo para adicionar disciplinas
	public void addDisciplina() {
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		
		int codigo = 0;
		do {
			System.out.print("Codigo da disciplina: ");
			codigo = ler.nextInt();
		} while(codigo < 999 && codigo > 9999);
		
		professorDisciplina();
		
		chamada();
		
		int numSala = 0;
		do {
			System.out.print("Numero da sala: ");
			numSala = ler.nextInt();
		} while(numSala < 100 && numSala > 399);
		
		int cargaHoraria = 0;
		do {
			System.out.print("Carga Horaria: ");
			cargaHoraria = ler.nextInt();
		} while(cargaHoraria !=2 || cargaHoraria !=4);
		
		System.out.print("Horario: ");
		String horario = ler.nextLine();
		
		custo(cargaHoraria);
		
		d.setNomeDisciplina(nome);
		d.setCodigoDisciplina(codigo);
		d.setSala(numSala);
		d.setCargaHoraria(cargaHoraria);
		d.setHorario(horario);		
		
		disciplinaDao.insert(d);
		
		System.out.println("Disciplina cadastrada!!!");
		System.out.println("\nContinuar em operacoes para disciplina?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para pesquisar disciplina
	public void readDisciplina() {
		String codigo = "";
		System.out.println("Digite o codigo para pesquisar uma disciplina: ");
		codigo = ler.nextLine();
		
		Disciplina disciplina= disciplinaDao.select(codigo);
		if(disciplina != null) {
			System.out.println("Nome: " + disciplina.getNomeDisciplina() + "\nCodigo: " + disciplina.getCodigoDisciplina() + 
			"\nProfessor: " + disciplina.getProfessor() + "\nChamada: " + disciplina.getChamada() + 
			"\nSala: " + disciplina.getSala() + "\nCarga Horaria: " + disciplina.getCargaHoraria() +
			"\nHorario: " + disciplina.getHorario() + "\nCusto: " + disciplina.getCusto());
		}
		
		System.out.println("Disciplina pesquisada!!!");
		System.out.println("\nContinuar em operacoes para disciplina?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para atualizar disciplina
	public void updateDisciplina() {
		int codigo = 0;
		System.out.println("Digite o codigo para atualizar uma disciplina: ");
		codigo = ler.nextInt();
		
		String str = Integer.toString(codigo);
		Disciplina disciplina = disciplinaDao.select(str);
		if(disciplina != null) {
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			
			professorDisciplina();
			
			chamada();
			
			int numSala = 0;
			do {
				System.out.print("Numero da sala: ");
				numSala = ler.nextInt();
			} while(numSala < 100 && numSala > 399);
			
			int cargaHoraria = 0;
			do {
				System.out.print("Carga Horaria: ");
				cargaHoraria = ler.nextInt();
			} while(cargaHoraria !=2 || cargaHoraria !=4);
			
			System.out.print("Horario: ");
			String horario = ler.nextLine();
			
			custo(cargaHoraria);
			
			d.setNomeDisciplina(nome);
			d.setCodigoDisciplina(codigo);
			d.setSala(numSala);
			d.setCargaHoraria(cargaHoraria);
			d.setHorario(horario);		
			
			disciplinaDao.update(d);
		}
		System.out.println("Disciplina atualizada!!!");
		System.out.println("\nContinuar em operacoes para disciplina?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para deletar disciplina
	public void deleteDisciplina() {
		Disciplina disciplina = new Disciplina();
		do {
			int codigo = 0;
			System.out.println("Digite o codigo para deletar uma disciplina: ");
			codigo = ler.nextInt();
			
			String str = Integer.toString(codigo);
			disciplina = disciplinaDao.select(str);
			if (disciplina != null) {
				disciplinaDao.delete(disciplina);
			}
		} while (disciplina == null);
		
		System.out.println("Disciplina Deletada!!!");
		System.out.println("\nContinuar em operacoes para disciplina?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Metodo para listar todas disciplinas
	public void listDisciplina() {
		List<Disciplina> listaDisciplinas = disciplinaDao.select();

		System.out.println("###### LISTA DE TODAS AS DISCIPLINAS ######");
		listaDisciplinas.forEach(disciplina -> {
			System.out.println("Codigo: " + disciplina.getCodigoDisciplina() + " Nome: " + disciplina.getNomeDisciplina());
		});
	}
	
	// Metodo para adicionar professor a disciplina
	public void professorDisciplina() {
		List<Professor> listaProfessor = professorDao.select();
		System.out.println("Escolha o professor:");
		listaProfessor.forEach(professor -> {
			System.out.println(
					"CPF: " + professor.getCpf() + " Nome: " + professor.getNome());
		});
		
		String p = "";
		Professor prof = new Professor();
		do {
			System.out.println("Digite o CPF do professor:");
			p = ler.nextLine();
			prof = professorDao.select(p);
			if (prof != null) {
				d.setProfessor(prof);
			}
		} while (prof == null);
	}
	
	// Metodo para adicionar alunos a disciplina(chamada)
	public void chamada() {
		List<Aluno> chamada = alunoDao.select();
		System.out.println("Escolha o aluno:");
		chamada.forEach(aluno -> {
			System.out.println(
					"Matricula: " + aluno.getMatricula() + " Nome: " + aluno.getNome());
		});
		
		String aluno = "";
		int contador = 0;
		do {
			System.out.println("Digite a matricula do aluno:");
			System.out.println("Caso tenha inserido todos digite q");
			aluno = ler.nextLine();
			Aluno al = alunoDao.select(aluno);
			if (al != null) {
				d.getChamada().add(al);
				contador++;
			}
		} while (!aluno.equals("q"));
	}
	
	// Metodo para calcular o custo da disciplina
	public void custo(double cargaHoraria) {
		Professor prof = new Professor();
		prof = professorDao.select(d.getProfessor().getCpf());
		double horaAula = 0;
		if(prof.getCategoria().equals(CategoriaProfessor.ESPECIALISTA)) {
			horaAula = 25;
		} else if(prof.getCategoria().equals(CategoriaProfessor.MESTRE)) {
			horaAula = 35;
		} else {
			horaAula = 45;
		}
		double custoSala = 30;
		double custo = horaAula * cargaHoraria + custoSala;
		d.setCusto(custo);
	}	
}