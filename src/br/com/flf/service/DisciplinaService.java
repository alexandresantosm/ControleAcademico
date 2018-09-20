package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Aluno;
import br.com.flf.model.Disciplina;

public class DisciplinaService {
	
	ArrayList<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	public ArrayList<Disciplina> getListaDeDisciplina() {
		return this.listaDeDisciplina;
	}
	
	// Criar Disciplina
	public void addDisciplina(String nomeDaDisciplina, int codigoDaDisciplina, ArrayList<Aluno> listaDeAluno, int numeroDaSala,
			int cargaHorariaDaDisciplina, int horarioDaDisciplina, double custoDaDisciplina) {
		Disciplina disciplina = new Disciplina(nomeDaDisciplina, codigoDaDisciplina, listaDeAluno, numeroDaSala,
				cargaHorariaDaDisciplina, horarioDaDisciplina, custoDaDisciplina);
		listaDeDisciplina.add(disciplina);
	}
	// Pesquisar Disciplina
	public Disciplina getDisciplina(int codigoDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getCodigoDaDisciplina() == codigoDaDisciplina) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
	
	public Disciplina getDisciplina(String nomeDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getNomeDaDisciplina().equals(nomeDaDisciplina)) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
}
