package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Aluno;
import br.com.flf.model.Curso;
import br.com.flf.model.SituacaoDoAluno;

public class AlunoService {
	
	// Cria uma lista de alunos
	ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
	
	public ArrayList<Aluno> getListaDeAluno() {
		return this.listaDeAluno;
	}
	
	// Cria um aluno e adiciona a lista de alunos
	public void addAluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			int matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, 
			Curso cursoDoAluno, DisciplinaService listaDisciplinaDoAluno) {
		Aluno aluno = new Aluno(nome, cpf, endereco, eMail, telefone, 
				matriculaDoAluno, situacaoDoAluno, cursoDoAluno, listaDisciplinaDoAluno);
		listaDeAluno.add(aluno);
	}
	
	// Pesquisa um aluno por telefone
	public Aluno getAluno(String telefone) {
		for (Aluno aluno : listaDeAluno) {
			
			if(aluno.getTelefone().equals(telefone)) {
				return aluno;
			}
		}
		System.out.println("Aluno nao encontrado!");
		return null;
	}
	
	// Pesquisa um aluno por matricula
	public Aluno getAluno(int matriculaDoAluno) {
		for (Aluno aluno : listaDeAluno) {
			if(aluno.getMatriculaDoAluno() == matriculaDoAluno) {
				return aluno;
			}
		}
		System.out.println("Aluno nao encontrado!");
		return null;
	}
	
	// Deleta um aluno pelo telefone
	public void deleteAluno(String telefone) {
		AlunoService aluno = new AlunoService();
		listaDeAluno.remove(aluno.getAluno(telefone));
	}
	
	// Deleta um aluno pela matricula
	public void deleteAluno(int matriculaDoAluno) {
		AlunoService aluno = new AlunoService();
		listaDeAluno.remove(aluno.getAluno(matriculaDoAluno));
	}
}
