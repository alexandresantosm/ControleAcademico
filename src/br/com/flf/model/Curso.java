package br.com.flf.model;

import java.util.ArrayList;

public class Curso {
	
	private String nomeDoCurso;
	private int codigoDoCurso;
	private char turnoDoCurso;
	private String professorCoordenadorDoCurso;
	private ArrayList<Disciplina> listaDisciplinaDoCurso;

	// Declaração dos construtores
	public Curso() {

	}

	public Curso(String nomeDoCurso, int codigoDoCurso) {
		this.nomeDoCurso   = nomeDoCurso;
		this.codigoDoCurso = codigoDoCurso;
	}

	public Curso(String nomeDoCurso, int codigoDoCurso, char turnoDoCurso, String professorCoordenadorDoCurso, 
		ArrayList<Disciplina> listaDisciplinaDoCurso) {
		this.nomeDoCurso 			     = nomeDoCurso;
		this.codigoDoCurso 			     = codigoDoCurso;
		this.turnoDoCurso 			     = turnoDoCurso;
		this.professorCoordenadorDoCurso = professorCoordenadorDoCurso;
		this.listaDisciplinaDoCurso   			 = listaDisciplinaDoCurso;
	}

	// Declaração dos getters
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}

	public int getCodigoDoCurso() {
		return this.codigoDoCurso;
	}

	public char getTurnoDoCurso() {
		return this.turnoDoCurso;
	}

	public String getProfessorCoordenadorDoCurso() {
		return this.professorCoordenadorDoCurso;
	}

	public ArrayList<Disciplina> getListaDisciplinaDoCurso() {
		return this.listaDisciplinaDoCurso;
	}
	
	// Declaração dos setters
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}

	public void setCodigoDoCurso(int codigoDoCurso) {
		this.codigoDoCurso = codigoDoCurso;
	}

	public void setTurnoDoCurso(char turnoDoCurso) {
		this.turnoDoCurso = turnoDoCurso;
	}

	public void setProfessorCoordenadorDoCurso(String professorCoordenadorDoCurso) {
		this.professorCoordenadorDoCurso = professorCoordenadorDoCurso;
	}

	public void setListaDisciplinaDoCurso(ArrayList<Disciplina> listaDisciplinaDoCurso) {
		this.listaDisciplinaDoCurso = listaDisciplinaDoCurso;
	}
}
