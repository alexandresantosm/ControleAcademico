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

	// Declaração do método getter
	public String getcategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}
	
	// Não tem o método setter
	
	// Declaração do método que irá mostrar a categoria do professor	
	public String toString() {
		return "Categoria: " + this.categoriaDoProfessor + "\n";
	}
}
