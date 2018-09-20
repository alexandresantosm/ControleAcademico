package br.com.flf.model;

public enum Turno {
	
	MANHA("Manha"),
	TARDE("Tarde"),
	NOITE("Noite");
	
	private String turno;
	
	Turno(String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return this.turno;
	}
	
	public String toString() {
		return "Turno: " + this.turno + "\n";
	}
}
