package models;

import java.util.ArrayList;
import java.util.List;

import enumsModels.CategoriaProfessor;

public class Professor extends Pessoa {
	
	private CategoriaProfessor categoria;
	private List<Disciplina> disciplinaProfessor = new ArrayList<>();
	
	public CategoriaProfessor getCategoria() {
		return categoria;
	}
	
	public void setCategoria(CategoriaProfessor categoria) {
		this.categoria = categoria;
	}
	
	public List<Disciplina> getDisciplinaProfessor() {
		return disciplinaProfessor;
	}
	
	public void setDisciplinaProfessor(List<Disciplina> disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}
	
	// Organiza os objetos da colecao em um mesmo bucket(compartilhamento)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	// Busca o objeto, compara o CPF do professor com os demais e recupera
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}	
}
