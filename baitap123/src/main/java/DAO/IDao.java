package DAO;

import java.util.List;

import entity.Student;

public interface IDao {
	public List<Student> data();
	public Student getById(int id);
	public boolean insertStudent(Student student);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(int id);
	
}
