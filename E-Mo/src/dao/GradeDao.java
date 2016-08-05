package dao;

import java.util.List;


import model.Grade;

import org.springframework.dao.DataAccessException;

public interface GradeDao {
	List findAll();
	//insert �߰� 
	void insertGrade(Grade grade) throws DataAccessException;
	
	//�� �л� ���� ������ ���� �޼ҵ� 
	List findGrade(Integer id);
	// ���� ���� ����� ���� �޼ҵ� 
	List findMonthGrade(Integer selectedMonth);
	
	// ���� ������Ʈ�� ���� �޼ҵ�
	void updateGrade(Grade grade) throws DataAccessException;
	
	//���� ����
	void deleteGrade(Grade grade) throws DataAccessException;
}
