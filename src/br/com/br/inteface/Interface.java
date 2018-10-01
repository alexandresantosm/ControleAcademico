package br.com.br.inteface;
/**
 * Classe Interface
 *  
 * @author Alexandre
 * @version 1.0
 */

import java.io.IOException;

import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;
import br.com.flf.service.AlunoService;
import br.com.flf.service.CursoService;
import br.com.flf.service.DisciplinaService;
import br.com.flf.service.ProfessorService;

public class Interface {
	Leitor teclado;
	AlunoService aluno;
	CursoService curso;
	DisciplinaService disciplina;
	ProfessorService professor;
	
	public Interface() {
		this.teclado 	= new Leitor();
		this.aluno 		= new AlunoService();
		this.curso 		= new CursoService();
		this.disciplina = new DisciplinaService();
		this.professor  = new ProfessorService();
	}
	
	public void showMenu() throws IOException {
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
			if(this.curso.getListaDeCurso().isEmpty()) {
				System.out.println("Cadastre cursos para poder cadastrar um aluno!");
				return;
			}
			
			if(this.disciplina.getListaDeDisciplina().isEmpty()) {
				System.out.println("Cadastre disciplinas para poder cadastrar um aluno!");
				return;
			}
			
			while (true) {
				System.out.print("Digite o nome de um curso ja cadastrado: ");
				String nomeCurso = this.teclado.leiaString();
				Curso curso = this.curso.getCurso(nomeCurso);
				if(curso == null) {
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
				long matriculaAluno = this.teclado.leiaLong();
				aluno.addAluno(nomeAluno, cpfAluno, enderecoAluno, eMailAluno, telefoneAluno, matriculaAluno, null);
				System.out.println("Aluno vinculado com sucesso!");
				break;
			}
			
			while (true) {
				System.out.print("Digite o nome de uma disciplina ja cadastrada: ");
				String nomeDisciplina = this.teclado.leiaString();
				Disciplina disciplina = this.disciplina.getDisciplina(nomeDisciplina);
				if(disciplina == null) {
					continue;
				}
				break;
			}
		}
		case 2: {
			aluno.listaAlunos();
			System.out.println(aluno.getListaDisciplinaDoAluno());
			break;
		}
		case 3: {
			// Cadastra curso
			break;
		}
		case 4: {
			curso.listaCursos();
			break;
		}
		case 5: {
			
			break;
		}
		case 6: {
			disciplina.listaDisciplinas();
			break;
		}
		case 99: {
			curso.povoaCursos();
			disciplina.povoaDisciplinas();
			aluno.povoaAlunos();
			aluno.addDisciplinaDoAluno(disciplina.getDisciplina("Calculo I"));
			professor.povoaProfessores();
			System.out.println("Dados inseridos com sucesso!");
			break;
		}
		default:
			System.out.println("Opcao invalida!");
			break;
		}
	}
}
























