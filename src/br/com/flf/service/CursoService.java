package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;
import br.com.flf.model.Turno;

public class CursoService {
	
	// Cria uma lista de cursos
	ArrayList<Curso> listaDeCurso = new ArrayList<Curso>();
	
	public ArrayList<Curso> getListaDeCurso() {
		return this.listaDeCurso;
	}
	
	// Cria um curso e adiciona a lista de cursos
	public void addCurso(String nomeDoCurso, int codigoDoCurso, Turno turnoDoCurso, String professorCoordenadorDoCurso, 
			ArrayList<Disciplina> listaDisciplinaDoCurso) {
		Curso curso = new Curso(nomeDoCurso, codigoDoCurso, turnoDoCurso, professorCoordenadorDoCurso, 
				listaDisciplinaDoCurso);
		listaDeCurso.add(curso);
	}
	
	// Pesquisa um curso pelo nome
	public Curso getCurso(String nomeDoCurso) {
		for (Curso curso : listaDeCurso) {
			if(curso.getNomeDoCurso().equals(nomeDoCurso)) {
				return curso;
			}
		}
		System.out.println("Curso nao encontrado!");
		return null;
	}
	
	// Pesquisa um curso pelo codigo
	public Curso getCurso(int codigoDoCurso) {
		for (Curso curso : listaDeCurso) {
			if(curso.getCodigoDoCurso() == codigoDoCurso) {
				return curso;
			}
		}
		System.out.println("Curso nao encontrado");
		return null;
	}
	
	// Deleta um curso pelo nome
	public void deleteCurso(String nomeDoCurso) {
		CursoService curso = new CursoService();
		listaDeCurso.remove(curso.getCurso(nomeDoCurso));
	}
	
	// Deleta um curso pelo codigo
	public void deleteCurso(int codigoDoCurso) {
		CursoService curso = new CursoService();
		listaDeCurso.remove(curso.getCurso(codigoDoCurso));
	}
}