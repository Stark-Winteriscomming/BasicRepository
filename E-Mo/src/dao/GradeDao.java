package dao;

import java.util.List;


import model.Grade;

import org.springframework.dao.DataAccessException;

public interface GradeDao {
	List findAll();
	//insert 추가 
	void insertGrade(Grade grade) throws DataAccessException;
	
	//한 학생 월별 성적을 위한 메소드 
	List findGrade(Integer id);
	// 월별 성적 출력을 위한 메소드 
	List findMonthGrade(Integer selectedMonth);
	
	// 성적 업데이트를 위한 메소드
	void updateGrade(Grade grade) throws DataAccessException;
	
	//성적 삭제
	void deleteGrade(Grade grade) throws DataAccessException;
}
