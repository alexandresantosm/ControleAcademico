package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.CategoriaDoProfessor;
import br.com.flf.model.Disciplina;
import br.com.flf.model.Professor;

public class ProfessorService {
	
	// Cria uma lista de professores
	ArrayList<Professor> listaDeProfessor = new ArrayList<Professor>();
	
	public ArrayList<Professor> getListaDeProfessor() {
		return this.listaDeProfessor;
	}
	
	// Cria um professor e adiciona a lista de professores
	public void addProfessor(String nome, String cpf, String endereco, String eMail, String telefone,
		CategoriaDoProfessor categoriaDoProfessor, ArrayList<Disciplina> listaDisciplinaDoProfessor) {
		Professor professor = new Professor(nome, cpf, endereco, eMail, telefone,
				categoriaDoProfessor, listaDisciplinaDoProfessor);
		listaDeProfessor.add(professor);
	}
	
	// Pesquisa um professor por nome ou telefone 
	public Professor getProfessor(String identificacaoDoProfessor) {
		for (Professor professor : listaDeProfessor) {
			if(professor.getTelefone().equals(identificacaoDoProfessor) || professor.getNome().equals(identificacaoDoProfessor)) {
				return professor;
			}
		}
		System.out.println("Professor nao encontrado!");
		return null;
	}
	
	// Pesquisa um professor pela categoria
	public Professor getProfessor(CategoriaDoProfessor categoriaDoProfessor) {
		for (Professor professor : listaDeProfessor) {
			if(professor.getCategoriaDoProfessor().equals(categoriaDoProfessor)) {
				return professor;
			}
		}
		System.out.println("Professor nao encontrado!");
		return null;
	}
	
	// Deleta um professor pelo nome ou telefone
	public void deleteProfessor(String identificacaoDoProfessor) {
		ProfessorService professor = new ProfessorService();
		listaDeProfessor.remove(professor.getProfessor(identificacaoDoProfessor));
	}
}
