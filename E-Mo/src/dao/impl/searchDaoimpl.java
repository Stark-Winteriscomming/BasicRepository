package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.student;
import model.user;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.studentDao;


public class searchDaoimpl extends JdbcDaoSupport implements studentDao{

	/*private static final String SELECT_STUDENTINFO = "SELECT ID,NAME,CALL,ADDRESS,SEX,ENROLL_DATE,SPEC,FATHER,MOTHER,BROTHER,SISTER FROM student";*/
	private static String SELECT_STUDENTINFO; 
	private String studentName;
	
	
	private class SearchRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			/* 예외 처리해주어야함 */
			
			student student = new student();
			student.setStudentId(new Integer(rs.getInt(1)));
			student.setStudentName(rs.getString(2));
			student.setCall(rs.getString(3));
			student.setAddress(rs.getString(4));
			student.setSex(rs.getString(5));
			student.setEnroll_date(rs.getString(6));
			student.setSpec(rs.getString(7));			
			student.setFather(rs.getString(8));
			student.setMother(rs.getString(9));
			student.setBrother(rs.getString(10));
			student.setSister(rs.getString(11));
			
			return student;
		}
	}
	
	@Override
	public List getStudentinfo() {
		// TODO Auto-generated method stub
		this.SELECT_STUDENTINFO = "SELECT * FROM student where Name='"+studentName+"'";
		return getJdbcTemplate().query(searchDaoimpl.SELECT_STUDENTINFO, new SearchRowMapper());
	}

	@Override
	public void setStudentsearchname(String name) {
		// TODO Auto-generated method stub
		this.studentName = name;
		
	}
	
	@Override
	public Integer getIdByName(String name){
		return null;
	}



	
	

}
