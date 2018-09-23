package br.com.flf.teste;

import br.com.flf.model.Aluno;
import br.com.flf.model.Curso;
import br.com.flf.model.SituacaoDoAluno;
import br.com.flf.service.AlunoService;
import br.com.flf.service.DisciplinaService;

public class TestaAluno {
	
	public static void main(String[] args) {
		// Titulo do sistema
		System.out.println("Sistema Controle Academico\n");
		
		// Instancia um objeto do tipo alunoService 
		AlunoService alunoService = new AlunoService();
		
		// Adiciona alunos
		alunoService.addAluno("Alex", "123.456.789-11", "Rua A", "alex@email.com", "(85) 1456-7878", 
				123, SituacaoDoAluno.MATRICULADO, new Curso(), new DisciplinaService());
		alunoService.addAluno("Maria", "120.888.999-00", "Rua B", "maria@email.com", "(85) 1456-1475", 
				456, SituacaoDoAluno.PENDENTE, new Curso(), new DisciplinaService());
		
		// Lista todos os alunos
		for (Aluno aluno : alunoService.getListaDeAluno()) {
			System.out.println(aluno.toString());
		}
		
		// Pesquisa e mostra o aluno atraves do telefone
		System.out.println("Pesquisar um aluno pelo telefone\n");
		System.out.println(alunoService.getAluno("(85) 1456-1475").toString());
		
		// Pesquisa e mostra o aluno atraves do numero de matricula
		System.out.println("Pesquisar um aluno pela matricula\n");
		System.out.println(alunoService.getAluno(123).toString().toString());
		
		// Deletar um aluno atraves do telefone
		System.out.println("Deletar um aluno pelo telefone\n");
		alunoService.deleteAluno("(85) 1456-1475");
				
		// Deletar um aluno atraves do numero de matricula
		System.out.println("Deletar um aluno pela matricula\n");
		alunoService.deleteAluno(123);
	}
}
