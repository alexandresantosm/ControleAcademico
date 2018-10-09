package dao;

import java.util.List;

import basemock.BancoDeDados;
import models.Aluno;

// Implementacao da Interface DAO.
public class AlunoDAO implements DAO<Aluno> {

	private List<Aluno> getDados() {
		return BancoDeDados.alunos;
	}
	
	// Metodo lita todos os aluno
	@Override
	public List<Aluno> select() {
		return getDados();
	}
	
	// Metodo pesquisa aluno pela matricula
	@Override
	public Aluno select(String matricula) {
		Aluno alunoRetornado = null;
		for (Aluno a : getDados()) {
			if (a.getMatricula().equals(matricula)) {
				alunoRetornado = a;
				break;
			}
		}
		return alunoRetornado;
	}
	
	// Metodo adiciona aluno
	@Override
	public void insert(Aluno aluno) {
		getDados().add(aluno);
	}

	// Metodo atualiza aluno
	@Override
	public void update(Aluno aluno) {
		getDados().forEach(al -> {
			if (al.equals(aluno))
				al = aluno;
		});
	}

	// Metodo apaga aluno
	@Override
	public void delete(Aluno aluno) {
		int contador = 0;
		for (Aluno a : getDados()) {
			if (a.equals(aluno))
				getDados().remove(contador);
			contador++;
		}
	}
}