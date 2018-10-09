package dao;

import java.util.List;

import basemock.BancoDeDados;
import models.Professor;

//Implementacao da Interface DAO.
public class ProfessorDAO implements DAO<Professor> {
	
	private List<Professor> getDados() {
		return BancoDeDados.professores;
	}
	
	// Metodo lita todos os professores
	@Override
	public List<Professor> select() {
		return getDados();
	}
	
	// Metodo pesquisa aluno pelo CPF
	@Override
	public Professor select(String cpf) {
		Professor professorRetornado = null;
		for (Professor p : getDados()) {
			if (p.getCpf().equals(cpf)) {
				professorRetornado = p;
				break;
			}
		}
		return professorRetornado;
	}
	
	// Metodo adiciona professor
	@Override
	public void insert(Professor professor) {
		getDados().add(professor);
	}

	// Metodo atualiza professor
	@Override
	public void update(Professor professor) {
		getDados().forEach(prof -> {
			if (prof.equals(professor))
				prof = professor;
		});
	}

	// Metodo apaga professor
	@Override
	public void delete(Professor professor) {
		int contador = 0;
		for (Professor p : getDados()) {
			if (p.equals(professor))
				getDados().remove(contador);
			contador++;
		}
	}
}