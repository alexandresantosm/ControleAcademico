package br.com.flf.service;

import java.util.ArrayList;
import java.util.List;

import br.com.flf.model.Aluno;
import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;
import br.com.flf.model.SituacaoDoAluno;
/**
 * Classe AlunoService
 * 
 * @author Alexandre
 * @version 1.0
 */
public class AlunoService {
	Aluno aluno = new Aluno();
	
	// Cria uma lista de alunos
	List<Aluno> listaDeAluno = new ArrayList<Aluno>();
	
	// Cria uma lista de disciplinas
	//List<Disciplina> listaDisciplinaDoAluno = new ArrayList<Disciplina>();
	
	/**
	 * Pega uma lista de aluno(s)
	 * 
	 * @return lista de aluno(s)
	 */
	public List<Aluno> getListaDeAluno() {
		return this.listaDeAluno;
	}
	
	/**
	 * Pega uma lista de disciplina(s) do aluno
	 * 
	 * @return lista de disciplina(s) do aluno
	 */
	public List<Disciplina> getListaDisciplinaDoAluno() {
		return this.aluno.getListaDisciplinaDoAluno();
	}
	
	/**
	 * Cria um aluno e adiciona a lista de alunos
	 * 
	 * @param nome do aluno
	 * @param cpf do aluno
	 * @param endereco do aluno
	 * @param eMail do aluno
	 * @param telefone do aluno
	 * @param matriculaDoAluno matricula do aluno
	 * @param situacaoDoAluno situacao do aluno
	 */
	public void addAluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			String matriculaDoAluno, SituacaoDoAluno situacaoDoAluno) {
		Aluno aluno = new Aluno(nome, cpf, endereco, eMail, telefone, 
				matriculaDoAluno, situacaoDoAluno);
		listaDeAluno.add(aluno);
	}
	
	public void addAluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			String matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, Curso curso, List<Disciplina> disciplina) {
		Aluno aluno = new Aluno(nome, cpf, endereco, eMail, telefone, 
				matriculaDoAluno, situacaoDoAluno, curso, disciplina);
		listaDeAluno.add(aluno);
	}
	
	/**
	 * Adiciona uma disciplina a lista de disciplina(s)
	 * 
	 * @param matriculaDoAluno do aluno
	 * @param disciplinaDoAluno do aluno
	 */
	public void addDisciplinaDoAluno(Disciplina disciplinaDoAluno) {
		aluno.setListaDisciplinaDoAluno(disciplinaDoAluno);
	}
	
	/**
	 * Pesquisa um aluno pela matricula
	 * 
	 * @param matriculaDoAluno do aluno
	 * @return objeto aluno
	 */
	public Aluno getAluno(String matriculaDoAluno) {
		for (Aluno aluno : listaDeAluno) {
			if(aluno.getMatriculaDoAluno() == matriculaDoAluno) {
				return aluno;
			}
		}
		System.out.println("Aluno nao encontrado!");
		return null;
	}
	
	/**
	 * Deleta um aluno pelo telefone
	 * 
	 * @param telefone do aluno
	 */
	public void deleteAluno(String telefone) {
		AlunoService aluno = new AlunoService();
		listaDeAluno.remove(aluno.getAluno(telefone));
	}
	
	public void listaAlunos() {
		for (Aluno aluno : listaDeAluno) {
			System.out.println(aluno.toString());
		}
	}
	
	public void listaDisciplinas() {
		System.out.println(aluno.getListaDisciplinaDoAluno().toString());
	}
	
	public void povoaAlunos() {
		
		addAluno("Alex", "28764341216", "Rua A, 1", "alex@email.com", "45933011", "111112162018", SituacaoDoAluno.MATRICULADO);
		addAluno("Pedro", "84256248028", "Rua dia, 48", "pedro@email.com", "35418035", "111180282018", SituacaoDoAluno.MATRICULADO);
		addAluno("Chico", "41598374553", "Rua Por do Sol, 99", "chico@email.com", "53638782", "111245532018", SituacaoDoAluno.MATRICULADO);
		addAluno("Lucas", "16051807469", "Rua Amanhecer, 10", "lucas@email.com", "43936411", "1114746922018", SituacaoDoAluno.PENDENTE);
	}
}
