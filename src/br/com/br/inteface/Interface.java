package br.com.br.inteface;
/**
 * Classe Interface
 *  
 * @author Alexandre
 * @version 1.0
 */

import java.util.Calendar;

import br.com.flf.model.Aluno;
import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;
import br.com.flf.model.Professor;
import br.com.flf.service.AlunoService;
import br.com.flf.service.CursoService;
import br.com.flf.service.DisciplinaService;
import br.com.flf.service.ProfessorService;

public class Interface {
	Leitor teclado;
	Calendar cal ;
	AlunoService alunoService;
	CursoService cursoService;
	DisciplinaService disciplinaService;
	ProfessorService professorService;
	Aluno aluno;
	Curso curso;
	Disciplina disciplina;
	Professor professor;
	
	public Interface() {
		this.teclado 	       = new Leitor();
		this.cal = Calendar.getInstance();
		this.alunoService 	   = new AlunoService();
		this.cursoService 	   = new CursoService();
		this.disciplinaService = new DisciplinaService();
		this.professorService  = new ProfessorService();
		this.aluno 	   = new Aluno();
		this.curso 	   = new Curso();
		this.disciplina = new Disciplina();
		this.professor  = new Professor();
		
	}
	
	public void showMenu() {
		int opcao = 1;
		
		while(opcao > 0) {
			System.out.println("");
			System.out.println("Escolha o numero da opcao:");
			System.out.println("(0) Sair");
			System.out.println("(1) Cadastrar Aluno");
			System.out.println("(2) Listar Alunos");
			System.out.println("(3) Cadastrar Curso");
			System.out.println("(4) Listar Cursos");
			System.out.println("(5) Cadastrar Disciplina");
			System.out.println("(6) Listar Disciplinas");
			System.out.println("(7) Cadastrar Professor");
			System.out.println("(8) Listar Professores");
			
			System.out.println("(99) Inserir dados de teste");
			System.out.println("");
			
			opcao = this.teclado.leiaInt();
			this.interpreter(opcao);
		}
	}

	private void interpreter(int opcao) {
		switch (opcao) {
		case 0: {
			System.out.println("Encerrando...");
			System.exit(0);
			break;
		}
		case 1: {
			if(this.cursoService.getListaDeCurso().isEmpty()) {
				System.out.println("Cadastre cursos para poder cadastrar um aluno!");
				return;
			}
			
			if(this.disciplinaService.getListaDeDisciplina().isEmpty()) {
				System.out.println("Cadastre disciplinas para poder cadastrar um aluno!");
				return;
			}
			
			while (true) {
				System.out.print("Digite o nome de um curso ja cadastrado: ");
				cursoService.listaCursos();
				String nomeCurso = this.teclado.leiaString();
				curso = this.cursoService.getCurso(nomeCurso);
				System.out.print("Digite o nome de uma disciplina ja cadastrada: ");
				disciplinaService.listaDisciplinas();
				String nomeDisciplina = this.teclado.leiaString();
				disciplina = this.disciplinaService.getDisciplina(nomeDisciplina);
				
				if(curso == null && disciplina == null) {
					continue;
				}
				
				System.out.println("Digite o nome do aluno: ");
				String nomeAluno = this.teclado.leiaString();
				System.out.println("Digite o CPF do aluno: ");
				String cpfAluno = this.teclado.leiaString();
				System.out.println("Digite o endereco do aluno: ");
				String enderecoAluno = this.teclado.leiaString();
				System.out.println("Digite o e-mail do aluno: ");
				String eMailAluno = this.teclado.leiaString();
				System.out.println("Digite o telefone do aluno: ");
				String telefoneAluno = this.teclado.leiaString();
				System.out.println("Digite a matricula do aluno: ");
				long cpf = Long.parseLong(cpfAluno.substring(cpfAluno.length()-4) + cal.get(Calendar.YEAR));
				String matriculaAluno = curso.getCodigoDoCurso() +""+ cpf;
				System.out.println("Matricula: " + matriculaAluno);
				//long matriculaAluno = this.teclado.leiaLong();
				aluno.setListaDisciplinaDoAluno(disciplina);
				alunoService.addAluno(nomeAluno, cpfAluno, enderecoAluno, eMailAluno, telefoneAluno, matriculaAluno, null, curso, aluno.getListaDisciplinaDoAluno());
				System.out.println("Aluno vinculado com sucesso!");
				break;
			}
			break;
		}
		case 2: {
			alunoService.listaAlunos();
			System.out.println(alunoService.getListaDisciplinaDoAluno());
			break;
		}
		case 3: {
			// Cadastra curso
			break;
		}
		case 4: {
			cursoService.listaCursos();
			break;
		}
		case 5: {
			
			break;
		}
		case 6: {
			disciplinaService.listaDisciplinas();
			break;
		}
		case 99: {
			cursoService.povoaCursos();
			disciplinaService.povoaDisciplinas();
			alunoService.povoaAlunos();
			alunoService.addDisciplinaDoAluno(disciplinaService.getDisciplina("Calculo I"));
			professorService.povoaProfessores();
			System.out.println("Dados inseridos com sucesso!");
			break;
		}
		default:
			System.out.println("Opcao invalida!");
			break;
		}
	}
}
























