package br.com.flf.service;

import java.util.ArrayList;
import java.util.List;

import br.com.flf.model.Aluno;
import br.com.flf.model.Disciplina;
/**
 * Classe DisciplinaService
 * 
 * @author Alexandre
 *@version 1.0
 */
public class DisciplinaService {
	
	// Cria uma lista de disciplinas
	List<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	public List<Disciplina> getListaDeDisciplina() {
		return this.listaDeDisciplina;
	}
	
	/**
	 * Cria uma disciplina e adiciona a lista de disciplinas
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 */
	public void addDisciplina(String nomeDaDisciplina) {
		Disciplina disciplina = new Disciplina();
		if(disciplina.getNomeDaDisciplina().equals(nomeDaDisciplina)) {
			new Aluno().setListaDisciplinaDoAluno(disciplina);
		}	
	}
	
	/**
	 * Cria uma disciplina e adiciona a lista de disciplinas
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 * @param codigoDaDisciplina codigo da disciplina
	 * @param numeroDaSala numero da sala
	 * @param cargaHorariaDaDisciplina carga horaria da disciplina
	 * @param horarioDaDisciplina horario da disciplina
	 * @param custoDaDisciplina custo da disciplina
	 */
	public void addDisciplina(String nomeDaDisciplina, int codigoDaDisciplina, int numeroDaSala,
			int cargaHorariaDaDisciplina, String horarioDaDisciplina, double custoDaDisciplina) {
		Disciplina disciplina = new Disciplina(nomeDaDisciplina, codigoDaDisciplina, numeroDaSala,
				cargaHorariaDaDisciplina, horarioDaDisciplina, custoDaDisciplina);
		listaDeDisciplina.add(disciplina);
	}
	
	public void addChamadaDeAluno() {
		for (Aluno aluno : new AlunoService().listaDeAluno) {
			new Disciplina().setChamadaDeAluno(aluno);
		}
	}
	
	/**
	 * Pesquisa uma disciplina pelo codigo
	 * 
	 * @param codigoDaDisciplina codigo da disciplina
	 * 
	 * @return objeto disciplina
	 */
	public Disciplina getDisciplina(int codigoDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getCodigoDaDisciplina() == codigoDaDisciplina) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
	
	/**
	 * Pesquisa uma disciplina pelo nome
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 * @return objeto disciplina
	 */
	public Disciplina getDisciplina(String nomeDaDisciplina) {
		for (Disciplina disciplina : listaDeDisciplina) {
			if(disciplina.getNomeDaDisciplina().equals(nomeDaDisciplina)) {
				return disciplina;
			}
		}
		System.out.println("Disciplina nao encontrada!");
		return null;
	}
	
	/**
	 * Deleta uma disciplina pelo codigo
	 * 
	 * @param codigoDaDisciplina codigo da disciplina
	 */
	public void deleteDisciplina(int codigoDaDisciplina) {
		DisciplinaService disciplina = new DisciplinaService();
		listaDeDisciplina.remove(disciplina.getDisciplina(codigoDaDisciplina));
	}
	
	/**
	 * Deleta uma disciplina pelo nome
	 * 
	 * @param nomeDaDisciplina nome da disciplina
	 */
	public void deleteDisciplina(String nomeDaDisciplina) {
		DisciplinaService disciplina = new DisciplinaService();
		listaDeDisciplina.remove(disciplina.getDisciplina(nomeDaDisciplina));
	}
	
	public void listaDisciplinas() {
		for (Disciplina disciplina : listaDeDisciplina) {
			System.out.println(disciplina.toString());
		}
	}
	
	public void povoaDisciplinas() {
		addDisciplina("Auditoria", 1000, 123, 22, "13:00 a 14:00", 75);
		addDisciplina("Calculo I", 1001, 395, 15, "18:30 a 20:00", 82.5);
		addDisciplina("Calculo II", 1002, 108, 30, "7:00 a 8:30", 97.5);
		addDisciplina("Fund. Adm.", 1003, 108, 18, "9:00 a 10:30", 112.5);
		addDisciplina("POO", 1004, 132, 30, "20:30 a 22:00", 82.5);
		addDisciplina("Introd. Inform", 1005, 362, 15, "18:30 a 20:00", 97.5);
	}
}