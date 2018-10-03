package br.com.flf.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Disciplina
 * 
 * @author Alexandre
 *@version 1.0
 */
public class Disciplina {
	
	// Declaracao dos atributos
	private String nomeDaDisciplina;
	private int codigoDaDisciplina;
	private List<Aluno> chamadaDeAluno = new ArrayList<Aluno>();
	private int numeroDaSala;
	private int cargaHorariaDaDisciplina;
	private String horarioDaDisciplina;
	private double custoDaDisciplina;

	/**
	 * Construtor de Disciplina vazio
	 * 
	 */
	public Disciplina() {

	}
	
	/**
	 * Construtor de Disciplina
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 */
	public Disciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina   = nomeDaDisciplina;
	}

	/**
	 * Construtor de Disciplina
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 * @param codigoDaDisciplina codigo da disciplina
	 */
	public Disciplina(String nomeDaDisciplina, int codigoDaDisciplina) {
		this.nomeDaDisciplina   = nomeDaDisciplina;
		this.codigoDaDisciplina = codigoDaDisciplina;
	}

	/**
	 * Construtor de Disciplina
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 * @param codigoDaDisciplina codigo da disciplina
	 * @param numeroDaSala numero da sala (valores entre 100 ate 399)
	 * @param cargaHorariaDaDisciplina carga horaria da disciplina
	 * @param horarioDaDisciplina horario da disciplina
	 * @param custoDaDisciplina custo da disciplina
	 */
	public Disciplina( String nomeDaDisciplina, int codigoDaDisciplina, int numeroDaSala,
		int cargaHorariaDaDisciplina, String horarioDaDisciplina, double custoDaDisciplina) {
		this.nomeDaDisciplina   	  = nomeDaDisciplina;
		this.codigoDaDisciplina 	  = codigoDaDisciplina;
		this.numeroDaSala 	    	  = numeroDaSala;
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
		this.horarioDaDisciplina 	  = horarioDaDisciplina;
		this.custoDaDisciplina 		  = custoDaDisciplina;	
	}
	
	/**
	 * Pega o nome da disciplina
	 * 
	 * @return nome da disciplina
	 */
	public String getNomeDaDisciplina() {
		return this.nomeDaDisciplina;
	}

	/**
	 * Pega o codigo da disciplina
	 * 
	 * @return codigo da disciplina
	 */
	public int getCodigoDaDisciplina() {
		return this.codigoDaDisciplina;
	}

	/**
	 * Pega a lista de alunos da disciplina
	 * 
	 * @return lista de alunos da disciplina
	 */
	public List<Aluno> getChamadaDeAluno() {
		return this.chamadaDeAluno;
	}

	/**
	 * Pega o numero da sala
	 * 
	 * @return numero da sala
	 */
	public int getNumeroDaSala() {
		return this.numeroDaSala;
	}

	/** Pega a carga horaria da disciplina
	 * 
	 * @return carga horaria da disciplina
	 */
	public int getCargaHorariaDaDisciplina() {
		return this.cargaHorariaDaDisciplina;
	}
	
	/**
	 * Pega o horario da disciplina
	 * 
	 * @return horario da disciplina
	 */
	public String getHorarioDaDisciplina() {
		return this.horarioDaDisciplina;
	}

	/**
	 * Pega o custo da disciplina
	 * 
	 * @return custo da disciplina
	 */
	public double getCustoDaDisciplina() {
		return this.custoDaDisciplina;
	}

	/**
	 * Seta o nome da disciplina
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 */
	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	/**
	 * Seta o codigo da disciplina
	 * 
	 * @param codigoDaDisciplina
	 */
	public void setCodigoDaDisciplina(int codigoDaDisciplina) {
		this.codigoDaDisciplina = codigoDaDisciplina;
	}

	/**
	 * Seta a lista de alunos da disciplina
	 * 
	 * @param listaDeAluno
	 */
	public void setChamadaDeAluno(Aluno aluno) {
		this.chamadaDeAluno.add(aluno);
	}

	/**
	 * Seta o numero da sala
	 * 
	 * @param numeroDaSala
	 */
	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}

	/**
	 * Seta a carga horaria da disciplina
	 * 
	 * @param cargaHorariaDaDisciplina
	 */
	public void setCargaHorariaDaDisciplina(int cargaHorariaDaDisciplina) {
		this.cargaHorariaDaDisciplina = cargaHorariaDaDisciplina;
	}
	
	/**
	 * Seta o horario da disciplina
	 * 
	 * @param horarioDaDisciplina
	 */
	public void setHorarioDaDisciplina(String horarioDaDisciplina) {
		this.horarioDaDisciplina = horarioDaDisciplina;
	}

	/**
	 * Seta o custo da disciplina
	 * 
	 * @param custoDaDisciplina
	 */
	public void setCustoDaDisciplina(double custoDaDisciplina) {
		this.custoDaDisciplina = custoDaDisciplina;
	}
	
	/**
	 * Mosta as informacoes da disciplina
	 * 
	 * @return uma string representando a disciplina
	 */
	public String toString() {
		return "\nDisciplina: " + this.nomeDaDisciplina + "\nCodigo: " + this.codigoDaDisciplina
				+ "\nLista de Aluno: " + this.chamadaDeAluno + "\nNumero da sala: " + this.numeroDaSala 
				+ "\nCarga Horaria: " + this.cargaHorariaDaDisciplina + "\nHorario: " + this.horarioDaDisciplina 
				+ "\nCusto: " + this.custoDaDisciplina;
	}
}
