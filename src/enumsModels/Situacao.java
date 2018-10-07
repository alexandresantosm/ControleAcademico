package enumsModels;

public enum Situacao {

	MATRICULADO("Matriculado"), PENDENTE("Pendente");

	private String situacaoAluno;

	private Situacao(String situacaoAluno) {
		this.situacaoAluno = situacaoAluno;
	}

	public String getSituacaoAluno() {
		return situacaoAluno;
	}

}
