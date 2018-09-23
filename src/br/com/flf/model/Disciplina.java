package br.com.flf.model;

import java.util.ArrayList;

public class Disciplina {
	
	// Declaracao dos atributos
	private String nomeDaDisciplina;
	private int codigoDaDisciplina;
	private ArrayList<Aluno> listaDeAluno;
	private int numeroDaSala;
	private int cargaHorariaDaDisciplina;
	private int horarioDaDisciplina;
	private double custoDaDisciplina;

	// Declaracao dos construtores
	public Disciplina() {

	}
	
	public Disciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina   = nomeDaDisciplina;
	}

	public Disciplina(String nomeDaDisciplina, int codigoDaDisciplina) {
		this.nomeDaDisciplina   = nomeDaDisciplina;
		this.codigoDaDisciplina = codigoDaDisciplina;
	}

	public Disciplina(String nomeDaDisciplina, int codigoDaDisciplina, ArrayList<Aluno> listaDeAluno, int numeroDaSala,
		int cargaHorariaDaDisciplina, int horarioDaDisciplina, double custoDaDisciplina) {
		this.nomeDaDisciplina   	  = nomeDaDisciplina;
		this.codigoDaDisciplina 	  = codigoDaDisciplina;
		this.listaDeAluno 			  = listaDeAluno;
		this.numeroDaSala 	    	  = numeroDaSala;
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
		this.horarioDaDisciplina 	  = horarioDaDisciplina;
		this.custoDaDisciplina 		  = custoDaDisciplina;	
	}

	// Declaracao dos getters
	public String getNomeDaDisciplina() {
		return this.nomeDaDisciplina;
	}

	public int getCodigoDaDisciplina() {
		return this.codigoDaDisciplina;
	}

	public ArrayList<Aluno> getListaDeAluno() {
		return this.listaDeAluno;
	}

	public int getNumeroDaSala() {
		return this.numeroDaSala;
	}

	public int getCargaHorariaDaDisciplina() {
		return this.cargaHorariaDaDisciplina;
	}
	
	public int getHorarioDaDisciplina() {
		return this.horarioDaDisciplina;
	}

	public double getCustoDaDisciplina() {
		return this.custoDaDisciplina;
	}

	// Declaracao dos setters
	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	public void setCodigoDaDisciplina(int codigoDaDisciplina) {
		this.codigoDaDisciplina = codigoDaDisciplina;
	}

	public void setListaDeAluno(ArrayList<Aluno> listaDeAluno) {
		this.listaDeAluno = listaDeAluno;
	}

	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}

	public void setCargaHorariaDaDisciplina(int cargaHorariaDaDisciplina) {
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
	}
	
	public void setHorarioDaDisciplina(int horarioDaDisciplina) {
		this.horarioDaDisciplina = horarioDaDisciplina;
	}

	public void setCustoDaDisciplina(double custoDaDisciplina) {
		this.custoDaDisciplina = custoDaDisciplina;
	}
	
	// Mosta as informacoes da disciplina
	public String toString() {
		return "Disciplina: " + this.nomeDaDisciplina + "\nCodigo: " + this.codigoDaDisciplina
				+ "\nLista de Aluno: " + this.listaDeAluno + "\nNumero da sala: " + this.numeroDaSala 
				+ "\nCarga Horaria: " + this.cargaHorariaDaDisciplina + "\nHorario: " + this.horarioDaDisciplina 
				+ "\nCusto: " + this.custoDaDisciplina + "\n";
	}
}
