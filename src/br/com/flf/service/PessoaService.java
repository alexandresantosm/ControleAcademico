package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Pessoa;

/* Para executar essa classe e necessario descomentar as linhas 19 e 20
 * Ir na classe Pessoa e remover o modificador abstract na declaração da classe
 */
public class PessoaService {
	
	//Atributos
	ArrayList<Pessoa> listaDePessoa = new ArrayList<Pessoa>();
	
	public ArrayList<Pessoa> getListaDePessoa() {
		return this.listaDePessoa;
	}
	
	// Criar pessoa
	public void addPessoa(String nome, String cpf, String endereco, String eMail, String telefone) {
		// Pessoa pessoa = new Pessoa(nome, cpf, endereco, eMail, telefone);
		// listaDePessoa.add(pessoa);
	}
	
	// Pesquisar pessoa
	public Pessoa getPessoa(String telefone) {
		for (Pessoa pessoa : listaDePessoa) {
			if(pessoa.getTelefone().equals(telefone)) {
				return pessoa;
			}
		}
		System.out.println("Pessoa nao encontrada!");
		return null;
	}
	
	public Pessoa getPessoa(String nome, String telefone) {
		for (Pessoa pessoa : listaDePessoa) {
			if((pessoa.getNome().equals(nome)) && (pessoa.getTelefone().equals(telefone))) {
				return pessoa;
			}
		}
		System.out.println("Pessoa nao encontrada!");
		return null;
	}
}
