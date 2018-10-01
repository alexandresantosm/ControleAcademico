package modelo;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	private String eMail;
	private String telefone;

	// Declara��o dos Construtores
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

	// Declara��o dos m�todos getters
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

	// Declara��o dos m�todos setters
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
}
