package dao;

import java.util.List;

import Models.Curso;

public class CursoDAO implements DAO<Curso>{

	@Override
	public void insert(Curso curso) {
		getDados().add(curso);
		
	}

	private List<Curso> getDados() {
		return getDados();
	}

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

	@Override
	public List<Curso> select() {
		return getDados();
	}

	@Override
	public Curso select(String codigo) {
		int cu = Integer.parseInt(codigo);
		Curso cursoRetornado = null;
		for(Curso c : getDados()) {
			if (c.getCodigo() == cu) {
				cursoRetornado = c;
				break;
			}
		}
		return cursoRetornado;
	}
}
