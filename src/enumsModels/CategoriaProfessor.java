package enumsModels;

public enum CategoriaProfessor {

	ESPECIALISTA("Especialisa"), MESTRE("Mestre"), DOUTOR("Doutor");

	private String categoria;

	private CategoriaProfessor(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
