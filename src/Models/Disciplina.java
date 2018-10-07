package Models;

import java.util.ArrayList;

public class Disciplina {

	private String nomeDisciplina;
	private int codigoDisciplina;
	Professor professor;
	ArrayList<Aluno> chamada = new ArrayList<>();
	private int sala;
	private double cargaHoraria;
	private String horario;
	private double custo;

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

}
