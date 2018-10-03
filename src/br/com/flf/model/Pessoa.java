package br.com.flf.model;

// A palavra chave abstract para impedir que ela possa ser instanciada.
// Esse é o efeito direto de se usar o modificador abstract na declaração de uma classe:

/**
 * Classe Pessoa
 * 
 * @author Alexandre
 * @version 1.0
 */
public abstract class Pessoa {
	
	// Declaracao dos atributos
	private String nome;
	private String cpf;
	private String endereco;
	private String eMail;
	private String telefone;
	
	/**
	 * Construtor da Pessoa vazio
	 * 
	 */
	public Pessoa() {

	}

	/**
	 * Construtor da Pessoa
	 * 
	 * @param nome da pessoa
	 * @param cpf da pessoa
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	/**
	 * Construtor da Pessoa
	 * 
	 * @param nome da pessoa
	 * @param cpf da pessoa
	 * @param endereco da pessoa
	 * @param eMail da pessoa
	 * @param telefone da pessoa
	 */
	public Pessoa(String nome, String cpf, String endereco, String eMail, String telefone) {
		this.nome       = nome;
		this.cpf        = cpf;
		this.endereco   = endereco;
		this.eMail      = eMail;
		this.telefone   = telefone;	
	}

	/**
	 * Pega o nome da pessoa
	 * 
	 * @return nome da pessoa
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Pega o cpf da pessoa
	 * 
	 * @return cpf da pessoa
	 */
	public String getCpf() {
		return this.cpf;
	}

	/**
	 * Pega o endereco da pessoa
	 * 
	 * @return endereco da pessoa
	 */
	public String getEndereco() {
		return this.endereco;
	}

	/**
	 * Pega o e-mail da pessoa
	 * 
	 * @return e-mail da pessoa
	 */
	public String getEmail() {
		return this.eMail;
	}

	/**
	 * Pega o telefone da pessoa
	 * 
	 * @return telefone da pessoa
	 */
	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * Seta o nome da pessoa
	 * 
	 * @param nome da pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Seta o cpf da pessoa
	 * 
	 * @param cpf da pessoa
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Seta o endereco da pessoa
	 * 
	 * @param endereco da pessoa
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Seta o e-mail da pessoa
	 * 
	 * @param eMail da pessoa
	 */
	public void setEmail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * Seta o telefone da pessoa
	 * 
	 * @param telefone da pessoa
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Mostra as informacoes da pessoa
	 * 
	 * @return uma string representando a pessoa
	 */
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nEndereco: " + 
				this.endereco + "\nE-mail: " + this.eMail + "\nTelefone: " + this.telefone;
	}
}
