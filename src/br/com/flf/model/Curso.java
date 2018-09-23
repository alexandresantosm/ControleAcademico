package br.com.flf.model;

import java.util.ArrayList;

public class Curso {
	
	// Declaracao dos atributos
	private String nomeDoCurso;
	private int codigoDoCurso;
	private Turno turnoDoCurso;
	private String professorCoordenadorDoCurso;
	private ArrayList<Disciplina> listaDisciplinaDoCurso;

	// Declaracao dos construtores
	public Curso() {

	}

	public Curso(String nomeDoCurso, int codigoDoCurso) {
		this.nomeDoCurso   = nomeDoCurso;
		this.codigoDoCurso = codigoDoCurso;
	}

	public Curso(String nomeDoCurso, int codigoDoCurso, Turno turnoDoCurso, String professorCoordenadorDoCurso, 
		ArrayList<Disciplina> listaDisciplinaDoCurso) {
		this.nomeDoCurso 			     = nomeDoCurso;
		this.codigoDoCurso 			     = codigoDoCurso;
		this.turnoDoCurso 			     = turnoDoCurso;
		this.professorCoordenadorDoCurso = professorCoordenadorDoCurso;
		this.listaDisciplinaDoCurso   			 = listaDisciplinaDoCurso;
	}

	// Declaracao dos getters
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}

	public int getCodigoDoCurso() {
		return this.codigoDoCurso;
	}

	public Turno getTurnoDoCurso() {
		return this.turnoDoCurso;
	}

	public String getProfessorCoordenadorDoCurso() {
		return this.professorCoordenadorDoCurso;
	}

	public ArrayList<Disciplina> getListaDisciplinaDoCurso() {
		return this.listaDisciplinaDoCurso;
	}
	
	// Declaracao dos setters
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}

	public void setCodigoDoCurso(int codigoDoCurso) {
		this.codigoDoCurso = codigoDoCurso;
	}

	public void setTurnoDoCurso(Turno turnoDoCurso) {
		this.turnoDoCurso = turnoDoCurso;
	}

	public void setProfessorCoordenadorDoCurso(String professorCoordenadorDoCurso) {
		this.professorCoordenadorDoCurso = professorCoordenadorDoCurso;
	}

	public void setListaDisciplinaDoCurso(ArrayList<Disciplina> listaDisciplinaDoCurso) {
		this.listaDisciplinaDoCurso = listaDisciplinaDoCurso;
	}
	
	// Mosta as informacoes do curso
	public String toString() {
		return "Curso: " + this.nomeDoCurso + "\nCodigo: " + this.codigoDoCurso + "Turno: " + this.turnoDoCurso +
				"\nCoordenador: "+ this.professorCoordenadorDoCurso + "\nDisciplinas:" + this.listaDisciplinaDoCurso;
	}
}
