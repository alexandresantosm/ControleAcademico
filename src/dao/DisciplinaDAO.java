package dao;

import java.util.List;

import Models.Disciplina;
import basemock.BancoDeDados;

public class DisciplinaDAO implements DAO<Disciplina>{

	@Override
	public void insert(Disciplina d) {
		getDados().add(d);
	}


	@Override
	public void update(Disciplina d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Disciplina d) {
		// TODO Auto-generated method stub
		
	}

	private List<Disciplina> getDados() {
		return BancoDeDados.disciplinas;
	}


	@Override
	public List<Disciplina> select() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Disciplina select(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}
}
