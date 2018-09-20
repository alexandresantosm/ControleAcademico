package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Aluno;
import br.com.flf.model.Curso;
import br.com.flf.model.SituacaoDoAluno;

public class AlunoService {
	
	ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
	
	public ArrayList<Aluno> getListaDeAluno() {
		return this.listaDeAluno;
	}
	
	public void addAluno(String nome, String cpf, String endereco, String eMail, String telefone, 
			int matriculaDoAluno, SituacaoDoAluno situacaoDoAluno, 
			Curso cursoDoAluno, DisciplinaService listaDisciplinaDoAluno) {
		Aluno aluno = new Aluno(nome, cpf, endereco, eMail, telefone, 
				matriculaDoAluno, situacaoDoAluno, cursoDoAluno, listaDisciplinaDoAluno);
		listaDeAluno.add(aluno);
	}
	
	public Aluno getAluno(String telefone) {
		for (Aluno aluno : listaDeAluno) {
			
			if(aluno.getTelefone().equals(telefone)) {
				return aluno;
			}
		}
		System.out.println("Aluno nao encontrado!");
		return null;
	}
	
	public Aluno getAluno(int matriculaDoAluno) {
		for (Aluno aluno : listaDeAluno) {
			if(aluno.getMatriculaDoAluno() == matriculaDoAluno) {
				return aluno;
			}
		}
		System.out.println("Aluno nao encontrado!");
		return null;
	}
}
