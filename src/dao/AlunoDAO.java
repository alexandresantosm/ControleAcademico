package dao;

import java.util.List;

import Models.Aluno;
import Models.Professor;

public class AlunoDAO implements DAO<Aluno> {

	@Override
	public void insert(Aluno aluno) {
		getDados().add(aluno);

	}

	private List<Aluno> getDados() {
		return getDados();
	}

	@Override
	public void update(Aluno aluno) {
		getDados().forEach(al -> {
			if (al.equals(aluno))
				al = aluno;
		});
	}

	@Override
	public void delete(Aluno aluno) {
		int contador = 0;
		for (Aluno a : getDados()) {
			if (a.equals(aluno))
				getDados().remove(contador);
			contador++;
		}
	}

	@Override
	public List<Aluno> select() {
		return getDados();
	}

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

}
