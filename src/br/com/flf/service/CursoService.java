package br.com.flf.service;

import java.util.ArrayList;
import java.util.List;

import br.com.flf.model.Curso;
import br.com.flf.model.Disciplina;
import br.com.flf.model.Professor;
import br.com.flf.model.Turno;
/**
 * Classe CursoService
 * 
 * @author Alexandre
 * @version 1.0
 */
public class CursoService {
	
	// Cria uma lista de cursos
	List<Curso> listaDeCurso = new ArrayList<Curso>();
	
	List<Disciplina> listaDeDisciplina = new ArrayList<Disciplina>();
	
	public List<Curso> getListaDeCurso() {
		return this.listaDeCurso;
	}
	
	/**
	 * Cria um curso e adiciona a lista de cursos
	 * 
	 * @param nomeDoCurso nome do curso
	 */
	public void addCurso(String nomeDoCurso) {
		Curso curso = new Curso(nomeDoCurso);
		listaDeCurso.add(curso);
	}
	
	/**
	 * Cria um curso e adiciona a lista de cursos
	 * 
	 * @param nomeDoCurso nome do curso
	 * @param codigoDoCurso codigo do curso
	 * @param turnoDoCurso turno do curso
	 * @param professorCoordenadorDoCurso coordenador do curso
	 * @param listaDisciplinaDoCurso lista de disciplina(s) do curso
	 */
	public void addCurso(String nomeDoCurso, int codigoDoCurso, Turno turnoDoCurso) {
		Curso curso = new Curso(nomeDoCurso, codigoDoCurso, turnoDoCurso);
		listaDeCurso.add(curso);
	}
	
	/**
	 * Adiciona um coordenador ao curso
	 * 
	 * @param coordenador do curso
	 * @return coordenador = professor
	 */
	public void addCoordenador(String coordenador) {
		for (Professor professor : new ProfessorService().listaDeProfessor) {
			if(professor.getNome().equals(coordenador)) {
				new Curso().setProfessorCoordenadorDoCurso(coordenador);
			}
		}
		System.out.println("Professor nao encontrado!");
	}
	
	/**
	 * Pesquisa um curso pelo nome
	 * 
	 * @param nomeDoCurso nome do curso
	 * @return objeto curso
	 */
	public Curso getCurso(String nomeDoCurso) {
		for (Curso curso : listaDeCurso) {
			if(curso.getNomeDoCurso().equals(nomeDoCurso)) {
				return curso;
			}
		}
		System.out.println("Curso nao encontrado!");
		return null;
	}
	
	/**
	 * Pesquisa um curso pelo codigo
	 * 
	 * @param codigoDoCurso codigo do curso
	 * @return objeto curso
	 */
	public Curso getCurso(int codigoDoCurso) {
		for (Curso curso : listaDeCurso) {
			if(curso.getCodigoDoCurso() == codigoDoCurso) {
				return curso;
			}
		}
		System.out.println("Curso nao encontrado");
		return null;
	}
	 
	/**
	 * Deleta um curso pelo nome
	 * 
	 * @param nomeDoCurso nome do curso
	 */
	public void deleteCurso(String nomeDoCurso) {
		CursoService curso = new CursoService();
		listaDeCurso.remove(curso.getCurso(nomeDoCurso));
	}
	
	/**
	 * Deleta um curso pelo codigo
	 * 
	 * @param codigoDoCurso codigo do curso
	 */
	public void deleteCurso(int codigoDoCurso) {
		CursoService curso = new CursoService();
		listaDeCurso.remove(curso.getCurso(codigoDoCurso));
	}
	
	public void listaCursos() {
		for (Curso curso : listaDeCurso) {
			System.out.println(curso.toString());
		}
	}
	
	public void povoaCursos() {
		addCurso("SI", 1111, Turno.NOITE);
		addCurso("Contabeis", 1112, Turno.TARDE);
		addCurso("Economia", 1113, Turno.MANHA);
		addCurso("Redes", 1114, Turno.NOITE);
	}
}