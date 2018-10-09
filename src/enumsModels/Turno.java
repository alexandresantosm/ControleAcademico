package enumsModels;

public enum Turno {

	MANHA("Manh�"), TARDE("Tarde"), NOITE("Noite");

	private String turno;

	private Turno(String turno) {
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

}
