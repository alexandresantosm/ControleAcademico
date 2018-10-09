package dao;

import java.util.List;

import basemock.BancoDeDados;
import models.Disciplina;

//Implementacao da Interface DAO.
public class DisciplinaDAO implements DAO<Disciplina>{

	private List<Disciplina> getDados() {
		return BancoDeDados.disciplinas;
	}
	
	// Metodo lita todas as disciplinas
	@Override
	public List<Disciplina> select() {
		return getDados();
	}

	// Metodo pesquisa disciplina pelo codigo
	@Override
	public Disciplina select(String codigo) {
		Disciplina disciplinaRetornado = null;
		for (Disciplina d : getDados()) {
			if (d.getCodigoDisciplina() == (Integer.parseInt(codigo))) {
				disciplinaRetornado = d;
				break;
			}
		}
		return disciplinaRetornado;
	}
	
	// Metodo adiciona disciplina
	@Override
	public void insert(Disciplina disciplina) {
		getDados().add(disciplina);
	}

	// Metodo atualiza disciplina
	@Override
	public void update(Disciplina disciplina) {
		getDados().forEach(disc -> {
			if (disc.equals(disciplina))
				disc = disciplina;
		});
	}

	// Metodo apaga disciplina
	@Override
	public void delete(Disciplina disciplina) {
		int contador = 0;
		for (Disciplina d : getDados()) {
			if (d.equals(disciplina))
				getDados().remove(contador);
			contador++;
		}		
	}
}