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

	// Declaracao do metodo getter
	public String getcategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}
	
	// Nao tem o metodo setter
	
	// Mostra a categoria do professor	
	public String toString() {
		return "Categoria: " + this.categoriaDoProfessor + "\n";
	}
}
