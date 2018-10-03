package br.com.flf.model;
/**
 * Enum SituacaoDoAluno
 * 
 * @author Alexandre
 *@version 1.0
 */
public enum SituacaoDoAluno {
	
	MATRICULADO("Matriculado"),
	PENDENTE("Pendente");

	private String situacaoDoAluno;

	/**
	 * Construtor de SituacaoDoAluno
	 * 
	 * @param situacaoDoAluno situacao do aluno
	 */
	SituacaoDoAluno(String situacaoDoAluno) {
		this.situacaoDoAluno = situacaoDoAluno;
	}

	/**
	 * Pega a situacao do aluno
	 * 
	 * @return situacao do aluno
	 */
	public String getSituacaoDoAluno() {
		return this.situacaoDoAluno;
	}
	
	/**
	 * Nao tem o metodo setter
	 */
	
	/**
	 * Mostra a situacao do aluno
	 * 
	 * @return uma string representando SituacaoDoAluno	
	 */
	public String toString() {
		return "Situacao do aluno: " + this.situacaoDoAluno;
	}
}
