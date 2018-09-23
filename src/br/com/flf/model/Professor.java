package br.com.flf.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	
	private CategoriaDoProfessor categoriaDoProfessor;
	private ArrayList<Disciplina> listaDisciplinaDoProfessor;

	// Declaracao dos construtores
	public Professor() {

	}

	public Professor(String nome, String cpf, CategoriaDoProfessor categoriaDoProfessor) {
		super(nome, cpf);
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	public Professor(String nome, String cpf, String endereco, String eMail, String telefone,
		CategoriaDoProfessor categoriaDoProfessor, ArrayList<Disciplina> listaDisciplinaDoProfessor) {
		super(nome, cpf, endereco, eMail, telefone);
		this.categoriaDoProfessor  = categoriaDoProfessor;
		this.listaDisciplinaDoProfessor = listaDisciplinaDoProfessor;
	}

	// Declaracao dos getters
	public CategoriaDoProfessor getCategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}

	public ArrayList<Disciplina> getListaDisciplinaDoProfessor() {
		return this.listaDisciplinaDoProfessor;
	}
	
	// Declaracao dos setters
	public void setCategoriaDoProfessor(CategoriaDoProfessor categoriaDoProfessor) {
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	public void setListaDisciplinaDoProfessor(ArrayList<Disciplina> listaDisciplinaDoProfessor) {
		this.listaDisciplinaDoProfessor = listaDisciplinaDoProfessor;
	}
	
	// Mosta as informacoes do professor
	public String toString() {
		return super.toString() + "Professor: " + this.categoriaDoProfessor + "\nDisciplinas: " + this.listaDisciplinaDoProfessor;
	}
}
