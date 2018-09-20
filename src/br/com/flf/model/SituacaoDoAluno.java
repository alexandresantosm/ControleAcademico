package br.com.flf.model;

public enum SituacaoDoAluno {
	
	MATRICULADO("Matriculado"),
	PENDENTE("Pendente");

	private String situacaoDoAluno;

	// Declaração do construtor
	SituacaoDoAluno(String situacaoDoAluno) {
		this.situacaoDoAluno = situacaoDoAluno;
	}

	// Declaração do método getter
	public String getSituacaoDoAluno() {
		return this.situacaoDoAluno;
	}
}
