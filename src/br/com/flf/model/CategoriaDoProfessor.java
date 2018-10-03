package br.com.flf.model;

/**
 * Enum CategoriaDoProfessor
 * 
 * @author Alexandre
 * @version 1.0
 */
public enum CategoriaDoProfessor {
	
	ESPECIALISTA("Especialista"),
	MESTRE("Mestre"),
	DOUTOR("Doutor");
	
	// Tem somente um atributo
	private String categoriaDoProfessor;

	/**
	 * Construtor de CategoriaDoProfessor
	 * 
	 * @param categoriaDoProfessor categoria do professor
	 */
	CategoriaDoProfessor(String categoriaDoProfessor) {
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	/**
	 * Pega a categoria do professor
	 * 
	 * @return categoria do professor
	 */
	public String getcategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}
	
	/**
	 *  Nao tem o metodo setter
	 */
	
	/**
	 * Mostra a categoria do professor
	 * 
	 * @return uma string representando a categoria do professor
	 */	
	public String toString() {
		return "Categoria: " + this.categoriaDoProfessor;
	}
}
