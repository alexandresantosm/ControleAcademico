package services;

import java.util.List;
import java.util.Scanner;

import Models.Curso;
import Models.Disciplina;
import Models.Professor;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import dao.ProfessorDAO;
import enumsModels.Turno;

public class CursoService {

	CursoDAO cursoDao = new CursoDAO();
	DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	ProfessorDAO professorDao = new ProfessorDAO();
	Curso c = new Curso();

	Scanner ler = new Scanner(System.in);

	// Método para Adicionar um Curso
	public void addCurso() {

		System.out.println("Nome: ");
		String nome = ler.nextLine();

		int codigo = 0;
		String cod = "";
		System.out.println("Código (apenas 4 digitos): ");
		do {
			cod += ler.nextLine();
			if (validador(ler.nextLine()))
			codigo = ler.nextInt();
		} while (codigo < 0000 && codigo > 9999);

		int opturno = 0;
		Turno turno = null;
		do {
			System.out.println("Turno: ");
			System.out.println("1_ Manhã /t 2_Tarde /t 3_noite");
			opturno = ler.nextInt();
			switch (opturno) {
			case 1: {
				turno = Turno.MANHA;
				break;
			}
			case 2: {
				turno = Turno.TARDE;
				break;
			}
			case 3: {
				turno = Turno.NOITE;
				break;
			}
			default:
				System.out.println("\nEscolha uma opção válida");
				break;
			}
		} while (opturno < 1 || opturno > 3);
		
		List<Professor> listaProfessor = professorDao.select();
		System.out.println("Escolha o coordendor:");
		listaProfessor.forEach(professor -> {
			System.out.println(
					"CPF: " + professor.getCpf() + " Nome: " + professor.getNome());
		});
		
		String coordenador = "";
		Professor prof = new Professor();
		do {
			System.out.println("Digite o CPF do professor:");
			coordenador = ler.nextLine();
			prof = professorDao.select(coordenador);
			if (prof != null) {
				c.setProfessor(prof);
			}
		} while (prof == null);
		
		grade();
		
		c.setNome(nome);
		c.setCodigo(codigo);
		c.setTurno(turno);
		
		cursoDao.insert(c);
		
	}

	private void grade() {

		List<Disciplina> listaDisciplina = disciplinaDao.select();
		System.out.println("Escolha as disciplinas:");
		listaDisciplina.forEach(disciplina -> {
			System.out.println(
					"Codigo: " + disciplina.getCodigoDisciplina() + " Nome: " + disciplina.getNomeDisciplina());
		});

		String disciplina = "";
		do {
			System.out.println("Digite o codigo da disciplina:");
			System.out.println("Caso tenha inserido todas digite q");
			disciplina = ler.nextLine();
			Disciplina dis = disciplinaDao.select(disciplina);
			if (dis != null) {
				c.getDisciplinasCurso().add(dis);
			}
		} while (!disciplina.equals("q"));

	}

	private boolean validador(String nextLine) {
		try {
			Integer integer = new Integer(nextLine);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void readCurso() {
		String codigo = "";
		System.out.println("Digite o codigo para pesquisar um curso: ");
		codigo = ler.nextLine();
		
		Curso curso = cursoDao.select(codigo);
		if(curso != null) {
			System.out.println("Nome: " + curso.getNome() + "\nCodigo: " + curso.getCodigo() + 
			"\nTurno: " + curso.getTurno() + "\nCoordenador: " + curso.getProfessor() + 
			"\nDisciplina: " + curso.getDisciplinasCurso());
		}
	}
	
	public void updateCurso() {
		String codigo = "";
		System.out.println("Digite o codigo para pesquisar um curso: ");
		codigo = ler.nextLine();
		
		Curso curso = cursoDao.select(codigo);
		if(curso != null) {
			System.out.println("Nome: ");
			String nome = ler.nextLine();

			int codig = 0;
			String cod = "";
			System.out.println("Código (apenas 4 digitos): ");
			do {
				cod += ler.nextLine();
				if (validador(ler.nextLine()))
				codig = ler.nextInt();
			} while (codig < 0000 && codig > 9999);

			int opturno = 0;
			Turno turno = null;
			do {
				System.out.println("Turno: ");
				System.out.println("1_ Manhã /t 2_Tarde /t 3_noite");
				opturno = ler.nextInt();
				switch (opturno) {
				case 1: {
					turno = Turno.MANHA;
					break;
				}
				case 2: {
					turno = Turno.TARDE;
					break;
				}
				case 3: {
					turno = Turno.NOITE;
					break;
				}
				default:
					System.out.println("\nEscolha uma opção válida");
					break;
				}
			} while (opturno < 1 || opturno > 3);
			
			List<Professor> listaProfessor = professorDao.select();
			System.out.println("Escolha o coordendor:");
			listaProfessor.forEach(professor -> {
				System.out.println(
						"CPF: " + professor.getCpf() + " Nome: " + professor.getNome());
			});
			
			String coordenador = "";
			Professor prof = new Professor();
			do {
				System.out.println("Digite o CPF do professor:");
				coordenador = ler.nextLine();
				prof = professorDao.select(coordenador);
				if (prof != null) {
					c.setProfessor(prof);
				}
			} while (prof == null);
			
			grade();
			
			c.setNome(nome);
			c.setCodigo(codig);
			c.setTurno(turno);
			
			cursoDao.update(c);
		}
	}
	
	public void deleteCurso() {
		Curso curso = new Curso();
		do {
			String codigo = "";
			System.out.println("Digite o codigo para deletar um curso: ");
			codigo = ler.nextLine();
			curso = cursoDao.select(codigo);
			if (curso != null) {
				cursoDao.delete(curso);
			}
		} while (curso == null);
	}
}
