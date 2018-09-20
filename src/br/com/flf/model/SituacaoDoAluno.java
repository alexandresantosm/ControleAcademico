package br.com.flf.model;

public enum SituacaoDoAluno {
	
	MATRICULADO("Matriculado"),
	PENDENTE("Pendente");

	private String situacaoDoAluno;

	// Declaracao do construtor
	SituacaoDoAluno(String situacaoDoAluno) {
		this.situacaoDoAluno = situacaoDoAluno;
	}

	// Declaracao do metodo getter
	public String getSituacaoDoAluno() {
		return this.situacaoDoAluno;
	}
	
	// Nao tem o metodo setter
	
	// Mostra a situacao do aluno	
	public String toString() {
		return "Categoria: " + this.situacaoDoAluno + "\n";
	}
}
