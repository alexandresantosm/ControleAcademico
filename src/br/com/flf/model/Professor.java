package br.com.flf.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	
	private CategoriaDoProfessor categoriaDoProfessor;
	private ArrayList<Disciplina> listaDisciplinaDoProfessor;

	// Declaração dos construtores
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

	// Declaração dos getters
	public CategoriaDoProfessor getCategoriaDoProfessor() {
		return this.categoriaDoProfessor;
	}

	public ArrayList<Disciplina> getListaDisciplinaDoProfessor() {
		return this.listaDisciplinaDoProfessor;
	}
	
	// Declaração dos setters
	public void setCategoriaDoProfessor(CategoriaDoProfessor categoriaDoProfessor) {
		this.categoriaDoProfessor = categoriaDoProfessor;
	}

	public void setListaDisciplinaDoProfessor(ArrayList<Disciplina> listaDisciplinaDoProfessor) {
		this.listaDisciplinaDoProfessor = listaDisciplinaDoProfessor;
	}
}
