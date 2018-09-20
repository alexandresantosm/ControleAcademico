package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Aluno;
import br.com.flf.model.Disciplina;

public class DisciplinaService {
	
	// Cria uma lista de disciplinas
	ArrayList<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	public ArrayList<Disciplina> getListaDeDisciplina() {
		return this.listaDeDisciplina;
	}
	
	// Cria uma disciplina e adiciona a lista de disciplinas
	public void addDisciplina(String nomeDaDisciplina, int codigoDaDisciplina, ArrayList<Aluno> listaDeAluno, int numeroDaSala,
			int cargaHorariaDaDisciplina, int horarioDaDisciplina, double custoDaDisciplina) {
		Disciplina disciplina = new Disciplina(nomeDaDisciplina, codigoDaDisciplina, listaDeAluno, numeroDaSala,
				cargaHorariaDaDisciplina, horarioDaDisciplina, custoDaDisciplina);
		listaDeDisciplina.add(disciplina);
	}
	
	// Pesquisa uma disciplina por codigo
	public Disciplina getDisciplina(int codigoDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getCodigoDaDisciplina() == codigoDaDisciplina) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
	
	// Pesquisa uma disciplina por nome
	public Disciplina getDisciplina(String nomeDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getNomeDaDisciplina().equals(nomeDaDisciplina)) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
	
	// Deleta uma disciplina pelo codigo
	public void deleteDisciplina(int codigoDaDisciplina) {
		DisciplinaService disciplina = new DisciplinaService();
		listaDeDisciplina.remove(disciplina.getDisciplina(codigoDaDisciplina));
	}
	
	// Deleta uma disciplina pelo nome
	public void deleteDisciplina(String nomeDaDisciplina) {
		DisciplinaService disciplina = new DisciplinaService();
		listaDeDisciplina.remove(disciplina.getDisciplina(nomeDaDisciplina));
	}
}
