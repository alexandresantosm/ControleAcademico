package br.com.flf.teste;

import java.util.ArrayList;

import br.com.flf.model.Curso;
import br.com.flf.model.Turno;
import br.com.flf.service.CursoService;

public class TestaCurso {
	
	public static void main(String[] args) {
		// Título do sistema
		System.out.println("Sistema Controle Academico\n");
					
		// Instancia um objeto do tipo cursoService
		CursoService cursoService = new CursoService();
		
		// Adiciona um curso
		cursoService.addCurso("SI", 1, Turno.NOITE, "Jordania", new ArrayList<>());
		
		//Lista todos os cursos
		for (Curso curso : cursoService.getListaDeCurso()) {
			System.out.println(curso.toString());
		}
		
		// Pesquisa e mostra o curso pelo codigo
		System.out.println("Pesquisar um curso pelo codigo\n");
		System.out.println(cursoService.getCurso(1).toString());
		
		// Pesquisa e mostra o curso pelo nome
		System.out.println("Pesquisar um curso pelo nome\n");
		System.out.println(cursoService.getCurso("SI").toString());
		
		// Deletar um curso pelo codigo
		System.out.println("Deletar um curso pelo codigo\n");
		cursoService.deleteCurso(1);
				
		// Deletar um curso pelo nome
		System.out.println("Deletar um curso pelo nome\n");
		cursoService.deleteCurso("SI");
	}
}
