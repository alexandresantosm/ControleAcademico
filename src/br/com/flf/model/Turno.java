package br.com.flf.model;

public enum Turno {
	
	MANHA("Manha"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	// Declaracao do atributo
	private String turno;
	
	// Declaracao do construtor
	Turno(String turno) {
		this.turno = turno;
	}
	
	// Declaracao do metodo getter
	public String getTurno() {
		return this.turno;
	}
	
	// Mostra o turno
	public String toString() {
		return "Turno: " + this.turno + "\n";
	}
}
