package dao;

import model.student;

import org.springframework.dao.DataAccessException;

public interface studentfixDao {
	void insertStudent(student student) throws DataAccessException;
	void updateStudent(student student) throws DataAccessException;
	void deleteStudent(student student) throws DataAccessException;

}
