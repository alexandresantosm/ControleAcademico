package br.com.flf.service;

import java.util.ArrayList;
import java.util.List;

import br.com.flf.model.CategoriaDoProfessor;
import br.com.flf.model.Disciplina;
import br.com.flf.model.Professor;
/**
 * Classe ProfessorService
 * 
 * @author Alexandre
 * @version 1.0
 */
public class ProfessorService {
	
	// Cria uma lista de professores
	List<Professor> listaDeProfessor = new ArrayList();
	
	/**
	 * Pega uma lista de professor(es)
	 * 
	 * @return lista de professor(es)
	 */
	public List<Professor> getListaDeProfessor() {
		return this.listaDeProfessor;
	}
	
	// Cria um professor e adiciona a lista de professor(es)
	/**
	 * @param nome do professor
	 * @param cpf do professor
	 * @param endereco do professor
	 * @param eMail do professor
	 * @param telefone do professor
	 * @param categoriaDoProfessor categoria do professor
	 * @param listaDisciplinaDoProfessor lista de disciplina(s) do professor
	 */
	public void addProfessor(String nome, String cpf, String endereco, String eMail, String telefone,
		CategoriaDoProfessor categoriaDoProfessor, ArrayList<Disciplina> listaDisciplinaDoProfessor) {
		Professor professor = new Professor(nome, cpf, endereco, eMail, telefone,
				categoriaDoProfessor, listaDisciplinaDoProfessor);
		listaDeProfessor.add(professor);
	}
	
	public void addProfessor(String nome) {
			Professor professor = new Professor(nome);
			listaDeProfessor.add(professor);
	}
	
	/**
	 * Pesquisa um professor pelo nome ou telefone
	 * 
	 * @param identificacaoDoProfessor nome ou telefone do professor
	 * @return objeto professor
	 */
	public Professor getProfessor(String identificacaoDoProfessor) {
		for (Professor professor : listaDeProfessor) {
			if(professor.getTelefone().equals(identificacaoDoProfessor) || professor.getNome().equals(identificacaoDoProfessor)) {
				return professor;
			}
		}
		System.out.println("Professor nao encontrado!");
		return null;
	}
	
	/**
	 * Deleta um professor pelo nome ou telefone
	 * 
	 * @param identificacaoDoProfessor nome ou telefone do professor
	 */
	public void deleteProfessor(String identificacaoDoProfessor) {
		ProfessorService professor = new ProfessorService();
		listaDeProfessor.remove(professor.getProfessor(identificacaoDoProfessor));
	}
	
	/**
	 * 
	 */
	public void listaProfessores() {
		for (Professor professor : listaDeProfessor) {
			System.out.println(professor.toString());
		}
	}
	
	public void povoaProfessores() {
		addProfessor("Jorge", "79502617583", "Rua Sao Goncalo, 478", "jorge.email.com", "41178061", CategoriaDoProfessor.ESPECIALISTA, null);
		addProfessor("Martha", "12280727416", "Rua B, 5", "martha.email.com", "20811398", CategoriaDoProfessor.DOUTOR, null);
		addProfessor("Samantha", "15604341129", "Rua G, 16", "samantha.email.com", "40710047", CategoriaDoProfessor.MESTRE, null);
	}
}
