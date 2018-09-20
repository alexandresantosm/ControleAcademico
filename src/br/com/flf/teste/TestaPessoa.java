package br.com.flf.teste;

import br.com.flf.model.Pessoa;
import br.com.flf.service.PessoaService;

public class TestaPessoa {
	public static void main(String[] args) {
		
		System.out.println("Sistema Controle Academico\n");
		
		PessoaService pessoaService = new PessoaService();
		pessoaService.addPessoa("Alex", "123.456.789-11", "Rua A", "alex@email.com", "(85) 1456-7878");
		pessoaService.addPessoa("Maria", "120.888.999-00", "Rua B", "maria@email.com", "(85) 1456-1475");
		
		for (Pessoa pessoa : pessoaService.getListaDePessoa()) {
			System.out.println(pessoa.toString());
		}
		
		System.out.println("Pesquisar uma pessoa pelo telefone\n");
		System.out.println(pessoaService.getPessoa("(85) 1456-1475").toString());
		
		System.out.println("Pesquisar uma pessoa pelo nome e pelo telefone\n");
		System.out.println(pessoaService.getPessoa("Alex", "(85) 1456-7878").toString());
	}
}
