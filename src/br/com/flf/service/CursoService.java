package br.com.flf.service;

import java.util.ArrayList;

import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;

public class CursoService {
	
	// Cria uma lista de cursos
	ArrayList<Curso> listaDeCurso = new ArrayList<Curso>();
	
	public ArrayList<Curso> getListaDeCurso() {
		return this.listaDeCurso;
	}
	
	// Cria um curso e adiciona a lista de cursos
	public void addCurso(String nomeDoCurso, int codigoDoCurso, char turnoDoCurso, String professorCoordenadorDoCurso, 
			ArrayList<Disciplina> listaDisciplinaDoCurso) {
		Curso curso = new Curso(nomeDoCurso, codigoDoCurso, turnoDoCurso, professorCoordenadorDoCurso, 
				listaDisciplinaDoCurso);
		listaDeCurso.add(curso);
	}
	
	
}
