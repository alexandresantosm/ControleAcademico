package models;

import java.util.ArrayList;

public class Disciplina {

	private String nomeDisciplina = "";
	private int codigoDisciplina = 0;
	Professor professor = new Professor();
	ArrayList<Aluno> chamada = new ArrayList<>();
	private int sala = 0;
	private double cargaHoraria = 0;
	private String horario = "";
	private double custo = 0;

	// GETTERS E SETTERS
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public ArrayList<Aluno> getChamada() {
		return chamada;
	}

	public int getSala() {
		return sala;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public String getHorario() {
		return horario;
	}

	public double getCusto() {
		return custo;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setChamada(ArrayList<Aluno> chamada) {
		this.chamada = chamada;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	// Organiza os objetos da colecao em um mesmo bucket(compartilhamento)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoDisciplina;
		return result;
	}
	
	// Busca o objeto, compara o codigo da disciplina com os demais e recupera 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (codigoDisciplina != other.codigoDisciplina)
			return false;
		return true;
	}
}