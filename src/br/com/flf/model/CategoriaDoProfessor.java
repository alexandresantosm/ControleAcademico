package br.com.flf.model;

public enum CategoriaDoProfessor {
	
	ESPECIALISTA("Especialista"),
	MESTRE("Mestre"),
	DOUTOR("Doutor");
	
	// Tem somente um atributo
	private String categoriaDoProfessor;

	// Declaracao do Construtor
	CategoriaDoProfessor(String categoriaDoProfessor) {
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	// Declara��o do m�todo getter
	public String getcategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}
	
	// N�o tem o m�todo setter
	
	// Declara��o do m�todo que ir� mostrar a categoria do professor	
	public String toString() {
		return "Categoria: " + this.categoriaDoProfessor + "\n";
	}
}
