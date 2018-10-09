package services;

import java.util.List;
import java.util.Scanner;

import controlLer.MenuAluno;
import controlLer.MenuPrincipal;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import dao.ProfessorDAO;
import enumsModels.Turno;
import models.Curso;
import models.Disciplina;
import models.Professor;

public class CursoService {

	private CursoDAO cursoDao = new CursoDAO();
	private DisciplinaDAO disciplinaDao = new DisciplinaDAO();
	private ProfessorDAO professorDao = new ProfessorDAO();
	private Curso c = new Curso();

	Scanner ler = new Scanner(System.in);

	// Método para adicionar curso
	public void addCurso() {

		System.out.println("Nome: ");
		String nome = ler.nextLine();

		String codigo = "";
		int cod = 0;
		do {
			System.out.println("Codigo (apenas 4 digitos): ");
			codigo = ler.nextLine();
			cod = Integer.parseInt(codigo);
		} while (cod < 1000 && cod > 9999);

		int opturno = 0;
		Turno turno = null;
		do {
			System.out.println("Turno: ");
			System.out.println("1 Manha /t 2 Tarde /t 3 Noite");
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
				System.out.println("\nEscolha uma opcao valida");
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
			System.out.print("Digite o CPF do professor: ");
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
		
		System.out.println("Curso Cadastrado!!!");
		System.out.println("\nContinuar em operacoes para cursos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Método para adicionar disciplinas a grade do curso
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
	
	// Método para pesquisar curso
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
		
		System.out.println("Curso Pesquisado!!!");
		System.out.println("\nContinuar em operacoes para cursos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Método para atualizar curso
	public void updateCurso() {
		String codigo = "";
		System.out.println("Digite o codigo para pesquisar um curso: ");
		codigo = ler.nextLine();
		
		Curso curso = cursoDao.select(codigo);
		if(curso != null) {
			System.out.println("Nome: ");
			String nome = ler.nextLine();

			int opturno = 0;
			Turno turno = null;
			do {
				System.out.println("Turno: ");
				System.out.println("1 Manha /t 2 Tarde /t 3 Noite");
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
					System.out.println("\nEscolha uma opcao valida");
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
			
			cursoDao.update(c);
		}
		
		System.out.println("Curso atualizado!!!");
		System.out.println("\nContinuar em operacoes para cursos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	// Método para deletar curso
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
		
		System.out.println("Curso Deletado!!!");
		System.out.println("\nContinuar em operacoes para cursos?");
		System.out.println("(1) SIM\n(2) NAO");
		int op = ler.nextInt();
		if (op == 1) {
			MenuAluno.menuAluno();
		}
		MenuPrincipal.menuPrincipal();
	}
	
	public void listCurso() {
		List<Curso> listaCursos = cursoDao.select();

		System.out.println("###### LISTA DE TODOS OS CURSOS ######");
		listaCursos.forEach(curso -> {
			System.out.println("Codigo: " + curso.getCodigo() + " Nome: " + curso.getNome());
		});
	}
}