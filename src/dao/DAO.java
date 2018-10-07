package dao;

import java.util.List;

public interface DAO<RT> {
	
	 void insert(RT d);
	 List<RT> select();
	 RT select(String codigo);
	 void update(RT d);
	 void delete(RT d);

}
