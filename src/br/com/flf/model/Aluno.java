package br.com.flf.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe Aluno
 * 
 * @author Alexandre
 * @version 1.0
 */
public class Aluno extends Pessoa{
	
	private String matriculaDoAluno;
	private SituacaoDoAluno situacaoDoAluno;
	private Curso cursoDoAluno = new Curso();
	private List<Disciplina> listaDisciplinaDoAluno = new ArrayList<Disciplina>();

	/**
	 * Construtor de Aluno vazio
	 */
	public Aluno() {

	}
	
	/**
	 * Construtor de Aluno
	 * 
	 * @param nome nome do aluno
	 * @param matriculaDoAluno matricula do aluno
	 */
	public Aluno(String nome, String matriculaDoAluno) {
		super(nome);
		this.matriculaDoAluno = matriculaDoAluno;
	}
	
	/**
     * Construtor de Aluno
     * 
     * @param nome nome do aluno
     * @param matriculaDoAluno matricula do aluno
     * @param situacaoDoAluno situacao do aluno
     * @param cursoDoAluno curso do aluno
     */
	public Aluno(String nome, String cpf, 
			String matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, Curso cursoDoAluno) {
		super(nome);
		this.matriculaDoAluno       = matriculaDoAluno;
		this.situacaoDoAluno        = situacaoDoAluno;
		this.cursoDoAluno           = cursoDoAluno;
	}
	
	/**
     * Construtor de Aluno
     * 
     * @param nome do aluno
     * @param cpf do aluno
     * @param endereco do aluno
     * @param eMail do aluno
     * @param telefone do aluno
     * @param matriculaDoAluno matricula do aluno
     * @param situacaoDoAluno situacao do aluno
     * @param cursoDoAluno curso do aluno
     */
	public Aluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			String matriculaDoAluno, SituacaoDoAluno situacaoDoAluno) {
		super(nome, cpf, endereco, eMail, telefone);
		this.matriculaDoAluno       = matriculaDoAluno;
		this.situacaoDoAluno        = situacaoDoAluno;
	}
	
	public Aluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			String matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, Curso curso, List<Disciplina> disciplina) {
		super(nome, cpf, endereco, eMail, telefone);
		this.matriculaDoAluno       = matriculaDoAluno;
		this.situacaoDoAluno        = situacaoDoAluno;
		this.cursoDoAluno = curso;
		this.listaDisciplinaDoAluno = disciplina;
	}
	
	/**
	 * Pega o numero de matricula do aluno
	 * 
	 * @return numero de matricula do aluno
	 */
	public String getMatriculaDoAluno() {
		return this.matriculaDoAluno;
	}

	/**
	 * Pega a situacao do aluno
	 * 
	 * @return objeto da situacao do aluno
	 */
	public SituacaoDoAluno getSituacaoDoAluno() {
		return this.situacaoDoAluno;
	}	
	
	/**
	 * Pega o curso do aluno
	 * 
	 * @return objeto do curso do aluno
	 */
	public Curso getCursoDoAluno() {
		return this.cursoDoAluno;
	}
	
	/**
	 * Pega a lista de disciplina(s) de aluno
	 * 
	 * @return lista de disciplina(s) de aluno
	 */
	public List<Disciplina> getListaDisciplinaDoAluno() {
		return this.listaDisciplinaDoAluno;
	}
	
	/**
	 * Seta o numero de matricula do aluno
	 * 
	 * @param matriculaDoAluno do aluno
	 */
	public void setMatriculaDoAluno(String matriculaDoAluno) {
        this.matriculaDoAluno = matriculaDoAluno;
	}
	
	/**
	 * Seta a situacao do aluno
	 * 
	 * @param situacaoDoAluno objeto situacao do aluno
	 */
	public void setSituacaoDoAluno(SituacaoDoAluno situacaoDoAluno) {
		this.situacaoDoAluno = situacaoDoAluno;
	}
	
	/**
	 * Seta o curso do aluno
	 * 
	 * @param cursoDoAluno objeto curso do aluno
	 */
	public void setCursoDoAluno(Curso cursoDoAluno) {
		this.cursoDoAluno = cursoDoAluno;
	}
	
	/**
	 * Seta a lista de disciplina(s) do aluno
	 * 
	 * @param listaDisciplinaDoAluno lista de disciplina(s) de aluno
	 */
	public void setListaDisciplinaDoAluno(Disciplina listaDisciplinaDoAluno) {
		this.listaDisciplinaDoAluno.add(listaDisciplinaDoAluno);
	}
	
	// Chamada de metodo da superclasse "super.toString()"
	/**
	 * Mostra as informacoes do aluno
	 * 
	 * @return uma string representando o aluno
	 */
	public String toString() {
		return  super.toString() + "Matricula: " +this.matriculaDoAluno + "\nSituacao: " + this.situacaoDoAluno +
			   "\nCurso: " + this.cursoDoAluno + "\nDisciplinas: " + this.listaDisciplinaDoAluno + "\n";
	}
}