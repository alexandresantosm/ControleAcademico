package br.com.flf.model;

public enum SituacaoDoAluno {
	
	MATRICULADO("Matriculado"),
	PENDENTE("Pendente");

	private String situacaoDoAluno;

	// Declara��o do construtor
	SituacaoDoAluno(String situacaoDoAluno) {
		this.situacaoDoAluno = situacaoDoAluno;
	}

	// Declara��o do m�todo getter
	public String getSituacaoDoAluno() {
		return this.situacaoDoAluno;
	}
}
