package br.com.flf.teste;

import java.util.ArrayList;

import br.com.flf.model.Disciplina;
import br.com.flf.service.DisciplinaService;

public class TestaDisciplina {
	
	public static void main(String[] args) {
		
		// Título do sistema
		System.out.println("Sistema Controle Academico\n");
					
		// Instancia um objeto do tipo disciplinaService
		DisciplinaService disciplinaService = new DisciplinaService();
		
		// Adiciona disciplina
		disciplinaService.addDisciplina("Sistemas Operacionais", 1, new ArrayList<>(), 401, 2, 18, 20);
		
		// Lista todos as disciplinas
		for (Disciplina disciplina : disciplinaService.getListaDeDisciplina()) {
			System.out.println(disciplina.toString());
		}
		
		// Pesquisa e mostra a disciplina atraves do codigo
		System.out.println("Pesquisar e mostrar a disciplina atraves do codigo\n");
		System.out.println(disciplinaService.getDisciplina(1));
		
		// Pesquisa e mostra a disciplina atraves do nome
		System.out.println("Pesquisar e mostrar a disciplina atraves do nome\n");
		System.out.println(disciplinaService.getDisciplina("Sistemas Operacionais"));
		
		// Deleta uma disciplina atraves do codigo
		System.out.println("Deletar a disciplina atraves do codigo\n");
		disciplinaService.deleteDisciplina(1);
		
		// Deleta uma disciplina atraves do nome
		System.out.println("Deletar a disciplina atraves do nome\n");
		disciplinaService.deleteDisciplina("Sistemas Operacionais");
	}
}
