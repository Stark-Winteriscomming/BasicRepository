package dao.impl;

import java.util.List;

import model.student;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.studentfixDao;



public class studentfixDaoimpl extends JdbcDaoSupport implements studentfixDao{
	
	private insertstudent insertstudent;
	private updatestudent updatestudent;
	private deletestudent deletestudent;
	
	protected void initDao() throws Exception
	{
		this.insertstudent = new insertstudent(getDataSource());
		this.updatestudent = new updatestudent(getDataSource());
		this.deletestudent = new deletestudent(getDataSource());
	}
	

	@Override
	public void insertStudent(student student) throws DataAccessException 
	{
		// TODO Auto-generated method stub
		this.insertstudent.update(new Object[]{student.getStudentName(),student.getCall(),student.getAddress(),student.getSex(),student.getEnroll_date(),student.getSpec(),student.getFather(),student.getMother(),student.getBrother(),student.getSister()});
		
	}

	@Override
	public void updateStudent(student student) throws DataAccessException {
		// TODO Auto-generated method stub
		this.updatestudent.update(new Object[]{student.getStudentName(),student.getCall(),student.getAddress(),student.getSex(),student.getEnroll_date(),student.getSpec(),student.getFather(),student.getMother(),student.getBrother(),student.getSister(),student.getStudentId()});
		
	}


	@Override
	public void deleteStudent(student student) throws DataAccessException {
		// TODO Auto-generated method stub
		this.deletestudent.update(new Object[]{student.getStudentId()});
	}
	
	



}
