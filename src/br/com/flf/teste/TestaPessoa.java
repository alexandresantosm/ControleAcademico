package br.com.flf.teste;

import br.com.flf.model.Pessoa;
import br.com.flf.service.PessoaService;

/* Para executar essa classe e necessario descomentar as linhas 19 e 20
 * Ir na classe Pessoa e remover o modificador abstract na declaração da classe
 */
public class TestaPessoa {
	public static void main(String[] args) {
		// Título do sistema
		System.out.println("Sistema Controle Academico\n");
		
		// Instancia um objeto do tipo pessoaService
		// Adiciona pessoa
		PessoaService pessoaService = new PessoaService();
		pessoaService.addPessoa("Alex", "123.456.789-11", "Rua A", "alex@email.com", "(85) 1456-7878");
		pessoaService.addPessoa("Maria", "120.888.999-00", "Rua B", "maria@email.com", "(85) 1456-1475");
		
		// Lista todas as pessoas
		for (Pessoa pessoa : pessoaService.getListaDePessoa()) {
			System.out.println(pessoa.toString());
		}
		
		// Pesquisa e mostra a pessoa atraves do telefone
		System.out.println("Pesquisar uma pessoa pelo telefone\n");
		System.out.println(pessoaService.getPessoa("(85) 1456-1475").toString());
		
		// Pesquisa e mostra a pessoa atraves do nome e telefone
		System.out.println("Pesquisar uma pessoa pelo nome e pelo telefone\n");
		System.out.println(pessoaService.getPessoa("Alex", "(85) 1456-7878").toString());
		
		// Deleta uma pessoa atraves do telefone
		System.out.println("Deletar uma pessoa pelo telefone\n");
		pessoaService.deletePessoa("(85) 1456-1475");
	}
}
