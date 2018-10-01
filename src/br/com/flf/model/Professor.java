package br.com.flf.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe Professor
 * 
 * @author Alexandre
 * @version 1.0
 */
public class Professor extends Pessoa{
	
	// Declaracao dos atributos
	private CategoriaDoProfessor categoriaDoProfessor;
	private List<Disciplina> listaDisciplinaDoProfessor = new ArrayList<Disciplina>();

	/**
	 * Construtor de Professor vazio
	 * 
	 */
	public Professor() {

	}

	/**
	 * Construtor de Professor
	 * 
	 * @param nome nome do professor
	 */
	public Professor(String nome) {
		super(nome);
	}

	/**
	 * Construtor de Professor
	 * 
	 * @param nome nome do professor
	 * @param cpf cpf do professor
	 * @param endereco endereco do professor
	 * @param eMail e-mail do professor
	 * @param telefone telefone do professor
	 * @param categoriaDoProfessor categoria do professor
	 * @param listaDisciplinaDoProfessor lista de disciplina do professor
	 */
	public Professor(String nome, String cpf, String endereco, String eMail, String telefone,
		CategoriaDoProfessor categoriaDoProfessor, List<Disciplina> listaDisciplinaDoProfessor) {
		super(nome, cpf, endereco, eMail, telefone);
		this.categoriaDoProfessor  = categoriaDoProfessor;
		this.listaDisciplinaDoProfessor = listaDisciplinaDoProfessor;
	}

	/**
	 * Pega o objeto CategoriaDoProfessor
	 * 
	 * @return objeto CategoriaDoProfessor
	 */
	public CategoriaDoProfessor getCategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}
	
	/**
	 * Pega a lista de disciplina do professor
	 * 
	 * @return lista de disciplina do professor
	 */
	public List<Disciplina> getListaDisciplinaDoProfessor() {
		return this.listaDisciplinaDoProfessor;
	}
	
	/**
	 * Seta o objeto CategoriaDoProfessor
	 * @param categoriaDoProfessor objeto CategoriaDoProfessor
	 */
	public void setCategoriaDoProfessor(CategoriaDoProfessor categoriaDoProfessor) {
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	/**
	 * Seta a lista de disciplina do professor
	 * @param listaDisciplinaDoProfessor lista de disciplina do professor
	 */
	public void setListaDisciplinaDoProfessor(List<Disciplina> listaDisciplinaDoProfessor) {
		this.listaDisciplinaDoProfessor = listaDisciplinaDoProfessor;
	}
	
	/**
	 * Mosta as informacoes do professor
	 * 
	 * @return uma string representando o professor
	 */
	public String toString() {
		return super.toString() + "Professor: " + this.categoriaDoProfessor + "\nDisciplinas: " + this.listaDisciplinaDoProfessor;
	}
}
