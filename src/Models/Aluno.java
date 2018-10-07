package Models;

import java.util.ArrayList;
import java.util.List;

import enumsModels.Situacao;

public class Aluno extends Pessoa {

	private Situacao situacao;
	private String matricula;
	Curso curso;
	List<Disciplina> disciplinaAluno = new ArrayList<>();

	//GETTERS & SETTERS
	public Situacao getSituacao() {
		return situacao;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public List<Disciplina> getDisciplinaAluno() {
		return disciplinaAluno;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setDisciplinaAluno(ArrayList<Disciplina> disciplinaAluno) {
		this.disciplinaAluno = disciplinaAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
}
