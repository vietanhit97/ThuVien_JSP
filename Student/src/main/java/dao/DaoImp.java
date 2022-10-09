package dao;

import java.util.List;

public interface DaoImp<T,Id> {
	List<T> getAll();
	T getById(Integer ID);
	boolean add(T student);
	boolean edit(T student);
	boolean remote(Id id);
}
