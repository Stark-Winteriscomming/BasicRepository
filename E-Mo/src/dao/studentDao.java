package dao;

import java.util.List;

import model.student;


public interface studentDao {
	List getStudentinfo();
	void setStudentsearchname(String name);
	public Integer getIdByName(String name);
}
