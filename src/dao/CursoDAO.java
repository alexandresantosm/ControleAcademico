package dao;

import java.util.List;

import basemock.BancoDeDados;
import models.Curso;

//Implementacao da Interface DAO.
public class CursoDAO implements DAO<Curso>{

	private List<Curso> getDados() {
		return BancoDeDados.cursos;
	}
	
	// Metodo lita todos os cursos
	@Override
	public List<Curso> select() {
		return getDados();
	}
	
	// Metodo pesquisa curso pelo codigo
	@Override
	public Curso select(String codigo) {
		Curso cursoRetornado = null;
		for(Curso c : getDados()) {
			if (c.getCodigo().equals(codigo)) {
				cursoRetornado = c;
				break;
			}
		}
		return cursoRetornado;
	}
	
	// Metodo adiciona curso
	@Override
	public void insert(Curso curso) {
		getDados().add(curso);
		
	}

	// Metodo atualiza curso
	@Override
	public void update(Curso curso) {
		getDados().forEach(curs -> {
			if(curs.equals(curso))
				curs = curso;
		});
	}

	@Override
	public void delete(Curso curso) {
		int contador = 0;
		for(Curso c : getDados()) {
			if(c.equals(curso))
				getDados().remove(contador);
			contador++;
		}
	}
}