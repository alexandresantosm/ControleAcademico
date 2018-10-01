package br.com.flf.model;
/**
 * Enum Turno
 * 
 * @author Alexandre
 * @version 1.0
 */
public enum Turno {
	
	MANHA("Manha"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	// Declaracao do atributo
	private String turno;
	
	/**
	 * Construtor de Turno
	 * 
	 * @param turno do curso
	 */
	Turno(String turno) {
		this.turno = turno;
	}
	
	/**
	 * Pega o turno do curso
	 * 
	 * @return turno do curso
	 */
	public String getTurno() {
		return this.turno;
	}
	
	/**
	 * Nao tem o metodo setter 
	 */
	
	/**
	 * Mostra a informacao do turno do curso
	 * 
	 * @return uma string representando turno
	 */
	public String toString() {
		return this.turno + "\n";
	}
}
