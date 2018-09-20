package br.com.flf.model;

// A palavra chave abstract para impedir que ela possa ser instanciada.
// Esse é o efeito direto de se usar o modificador abstract na declaração de uma classe:
public abstract class Pessoa {
	
	// Declaracao dos atributos
	private String nome;
	private String cpf;
	private String endereco;
	private String eMail;
	private String telefone;

	// Declaracao dos Construtores
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf  = cpf;
	}

	public Pessoa(String nome, String cpf, String endereco, String eMail, String telefone) {
		this.nome       = nome;
		this.cpf        = cpf;
		this.endereco   = endereco;
		this.eMail      = eMail;
		this.telefone   = telefone;	
	}

	// Declaracao dos metodos getters
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getEmail() {
		return this.eMail;
	}

	public String getTelefone() {
		return this.telefone;
	}

	// Declaracao dos metodos setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEmail(String eMail) {
		this.eMail = eMail;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Mostra as informacoes da pessoa
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nEndereco: " + 
				this.endereco + "\nE-mail: " + this.eMail + "\nTelefone: " + this.telefone + "\n";
	}
}
