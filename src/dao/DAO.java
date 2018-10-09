package dao;

import java.util.List;

// Interface DAO recebendo um parametro generico RT.
// Diz o que as classes DAO devem ter, o CRUD. 
// Os metodos na interface nao tem corpo, apenas assinatura.
public interface DAO<RT> {
	
	 public void insert(RT d);
	 public List<RT> select();
	 public RT select(String codigo);
	 public void update(RT d);
	 public void delete(RT d);
}
