package br.com.flf.teste;

import java.util.ArrayList;

import br.com.flf.model.CategoriaDoProfessor;
import br.com.flf.model.Professor;
import br.com.flf.service.ProfessorService;

public class TestaProfessor {
	
	public static void main(String[] args) {
		// Título do sistema
		System.out.println("Sistema Controle Academico\n");
		
		// Instancia um objeto do tipo ProfessorService
		ProfessorService professorService = new ProfessorService();
		
		// Adiciona professor
		professorService.addProfessor("Jose", "000.000.000-00", "Rua do Professor", "professor@email.com", "(85) 1234567", CategoriaDoProfessor.MESTRE, new ArrayList<>());
		
		// Lista todos os Professores
		for (Professor professor : professorService.getListaDeProfessor()) {
			System.out.println(professor.toString());
		}
		
		// Pesquisa e mostra o professor atraves do telefone
		System.out.println("Pesquisar um professor pelo telefone\n");
		System.out.println(professorService.getProfessor("(85) 1234567").toString());
		
		// Pesquisa e mostra o professor atraves do nome
		System.out.println("Pesquisar um professor pelo nome\n");
		System.out.println(professorService.getProfessor("Jose").toString());
		
		// Deletar um professor atraves do telefone
		System.out.println("Deletar um professor pelo telefone\n");
		professorService.deleteProfessor("(85) 1234567");
				
		// Deletar um professor atraves do nome
		System.out.println("Deletar um professor pelo nome\n");
		professorService.deleteProfessor("Jose");
	}
}
