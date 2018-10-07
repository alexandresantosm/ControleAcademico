package services;

import java.util.List;
import java.util.Scanner;

import Models.Aluno;
import Models.Curso;
import Models.Disciplina;
import Models.Professor;
import dao.AlunoDAO;
import dao.DisciplinaDAO;
import dao.ProfessorDAO;
import enumsModels.CategoriaProfessor;

public class DisciplinaService {
	
	ProfessorDAO professorDao = new ProfessorDAO();
	AlunoDAO alunoDao = new AlunoDAO();
	DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	Disciplina d = new Disciplina();
	Scanner ler = new Scanner(System.in);

	public void addDisciplina() {
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		
		int codigo = 0;
		do {
			System.out.print("Código da Disciplina: ");
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
	}
	
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
	}
	
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
