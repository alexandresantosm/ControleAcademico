package br.com.flf.service;

import java.util.ArrayList;
import java.util.List;

import br.com.flf.model.Pessoa;

/* Para executar essa classe e necessario descomentar as linhas 19 e 20
 * Ir na classe Pessoa e remover o modificador abstract na declaração da classe
 */

/**
 * Classe PessoaService
 * 
 * @author Alexandre
 * @version 1.0
 */
public class PessoaService {
	
	//Atributos
	List<Pessoa> listaDePessoa = new ArrayList();
	
	/**
	 * Pega uma lista de pessoa(s)
	 * 
	 * @return lista de pessoa(s)
	 */
	public List<Pessoa> getListaDePessoa() {
		return this.listaDePessoa;
	}
	
	// 
	/**
	 * Cria uma pessoa e adiciona a lista de pessoa(s)
	 * 
	 * @param nome da pessoa
	 * @param cpf da pessoa
	 * @param endereco da pessoa
	 * @param eMail da pessoa
	 * @param telefone da pessoa
	 */
	public void addPessoa(String nome, String cpf, String endereco, String eMail, String telefone) {
		// Pessoa pessoa = new Pessoa(nome, cpf, endereco, eMail, telefone);
		// listaDePessoa.add(pessoa);
	}
	
	// 
	/**
	 * Pesquisa uma pessoa pelo telefone
	 * 
	 * @param telefone da pessoa
	 * @return objeto pessoa
	 */
	public Pessoa getPessoa(String telefone) {
		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getTelefone().equals(telefone)) {
				return pessoa;
			}
		}
		System.out.println("Pessoa nao encontrada!");
		return null;
	}
	
	/**
	 * Pesquisa uma pessoa pelo nome e telefone
	 * 
	 * @param nome da pessoa
	 * @param telefone da pessoa
	 * @return objeto pessoa
	 */
	public Pessoa getPessoa(String nome, String telefone) {
		for (Pessoa pessoa : listaDePessoa) {
			if((pessoa.getNome().equals(nome)) && (pessoa.getTelefone().equals(telefone))) {
				return pessoa;
			}
		}
		System.out.println("Pessoa nao encontrada!");
		return null;
	}
	
	/**
	 * Deleta uma pessoa pelo telefone
	 * 
	 * @param telefone da pessoa
	 */
	public void deletePessoa(String telefone) {
		PessoaService pessoa = new PessoaService();
		listaDePessoa.remove(pessoa.getPessoa(telefone));
	}
}
