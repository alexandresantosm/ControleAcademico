package Models;

import java.util.ArrayList;
import java.util.List;

import enumsModels.Turno;

public class Curso {

	private String nome;
	private Integer codigo;
	private Turno turno;
	private Professor professor;
	private List<Disciplina> disciplinasCurso = new ArrayList<>();

	// GETTERS & SETTERS
	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public Turno getTurno() {
		return turno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public List<Disciplina> getDisciplinasCurso() {
		return disciplinasCurso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setDisciplinasCurso(ArrayList<Disciplina> disciplinasCurso) {
		this.disciplinasCurso = disciplinasCurso;
	}

}
