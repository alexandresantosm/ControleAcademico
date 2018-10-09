package models;

import java.util.ArrayList;
import java.util.List;

import enumsModels.Turno;

public class Curso {

	private String nome = "";
	private String codigo = "";
	private Turno turno;
	private Professor professor = new Professor();
	private List<Disciplina> disciplinasCurso = new ArrayList<>();
	
	// GETTERS & SETTERS
	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public Turno getTurno() {
		return turno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public List<Disciplina> getDisciplinasCurso() {
		return disciplinasCurso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setDisciplinasCurso(ArrayList<Disciplina> disciplinasCurso) {
		this.disciplinasCurso = disciplinasCurso;
	}
	
	// Organiza os objetos da colecao em um mesmo bucket(compartilhamento)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	
	// Busca o objeto, compara o codigo do curso com os demais e recupera
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}