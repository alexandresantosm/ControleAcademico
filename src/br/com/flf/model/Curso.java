package br.com.flf.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe Curso
 * 
 * @author Alexandre
 * @version 1.0
 */
public class Curso {
	
	// Declaracao dos atributos
	private String nomeDoCurso;
	private int codigoDoCurso;
	private Turno turnoDoCurso;
	private String professorCoordenadorDoCurso;
	// private List<Disciplina> listaDisciplinaDoCurso = new ArrayList<Disciplina>();

	/**
	 * Construtor de Curso vazio
	 * 
	 */
	public Curso() {

	}

	/**
	 * Construtor de Curso
	 * 
	 * @param nomeDoCurso nome do curso
	 */
	public Curso(String nomeDoCurso) {
		this.nomeDoCurso   = nomeDoCurso;
	}

	/**
	 * Construtor de Curso
	 * 
	 * @param nomeDoCurso nome do curso
	 * @param codigoDoCurso codigo do curso
	 * @param turnoDoCurso turno do curso
	 * @param professorCoordenadorDoCurso nome do coordenador do curso
	 * @param listaDisciplinaDoCurso lista di disciplinas do curso
	 */
	public Curso(String nomeDoCurso, int codigoDoCurso, Turno turnoDoCurso) {
		this.nomeDoCurso   = nomeDoCurso;
		this.codigoDoCurso = codigoDoCurso;
		this.turnoDoCurso  = turnoDoCurso;
	}

	/**
	 * Pega o nome do curso
	 * 
	 * @return nome do curso
	 */
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}

	/**
	 * Pega o codigo do curso
	 * 
	 * @return codigo do curso
	 */
	public int getCodigoDoCurso() {
		return this.codigoDoCurso;
	}
	
	/**
	 * Pega o turno do curso
	 * 
	 * @return turno do curso
	 */
	public Turno getTurnoDoCurso() {
		return this.turnoDoCurso;
	}
	
	/**
	 * Pega o coordenador do curso
	 * 
	 * @return coordenador do curso
	 */
	public String getProfessorCoordenadorDoCurso() {
		return this.professorCoordenadorDoCurso;
	}
	
	/**
	 * Pega a lista de disciplinas do curso
	 * 
	 * @return lista de disciplinas do curso
	 */
	/*public List<Disciplina> getListaDisciplinaDoCurso() {
		return this.listaDisciplinaDoCurso;
	}*/
	
	/**
	 * Seta o nome do curso
	 * 
	 * @param nomeDoCurso nome do curso
	 */
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	/**
	 * Seta o codigo do curso
	 * 
	 * @param codigoDoCurso codigo do curso
	 */
	public void setCodigoDoCurso(int codigoDoCurso) {
		if (codigoDoCurso >= 1000 && codigoDoCurso <= 9999) {
			this.codigoDoCurso = codigoDoCurso;
		} else {
			System.out.println("Codigo invalido!");
		}
	}
	
	/**
	 * Seta o objeto turno
	 * 
	 * @param turnoDoCurso objeto turno
	 */
	public void setTurnoDoCurso(Turno turnoDoCurso) {
		this.turnoDoCurso = turnoDoCurso;
	}
	
	/**
	 * Seta o coordenador do curso
	 * 
	 * @param professorCoordenadorDoCurso coordenador do curso 
	 */
	public void setProfessorCoordenadorDoCurso(String professorCoordenadorDoCurso) {
		this.professorCoordenadorDoCurso = professorCoordenadorDoCurso;
	}
	
	/**
	 * Seta a lista de disciplinas do curso
	 * 
	 * @param listaDisciplinaDoCurso lista de disciplinas do curso
	 */
	/*public void setListaDisciplinaDoCurso(Disciplina listaDisciplinaDoCurso) {
		this.listaDisciplinaDoCurso.add(listaDisciplinaDoCurso);
	}*/
	
	/**
	 * Mostra as informacoes do curso
	 * 
	 * @return uma string representando o curso
	 */
	public String toString() {
		return "Curso: " + this.nomeDoCurso + "\nCodigo: " + this.codigoDoCurso + "Turno: " + this.turnoDoCurso +
				"\nCoordenador: "+ this.professorCoordenadorDoCurso;
	}
}
