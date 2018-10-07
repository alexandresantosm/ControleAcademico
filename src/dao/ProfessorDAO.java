package dao;

import java.util.List;

import Models.Professor;

public class ProfessorDAO implements DAO<Professor>{

	@Override
	public void insert(Professor professor) {
		getDados().add(professor);
	}

	private List<Professor> getDados() {
		return getDados();
	}

	@Override
	public void update(Professor professor) {
		getDados().forEach(da -> {
			if(da.equals(professor))
				da = professor;
		});		
	}

	@Override
	public void delete(Professor professor) {
		int contador = 0;
		for(Professor p : getDados()) {
			if(p.equals(professor))
				getDados().remove(contador);
			contador++;			
		}	
	}

	@Override
	public List<Professor> select() {
		return getDados();
	}

	@Override
	public Professor select(String cpf) {
		Professor professorRetornado = null;
		for(Professor p : getDados()){
			if(p.getCpf().equals(cpf)) {
				professorRetornado = p;
				break;
			}
		}
		return professorRetornado;
	}
}
