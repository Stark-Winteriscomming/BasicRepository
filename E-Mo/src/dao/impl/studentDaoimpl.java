package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.student;
import model.user;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.studentDao;
//import dao.impl.userDaoimpl.UserRowMapper;


public class studentDaoimpl extends JdbcDaoSupport implements studentDao{

	private static final String SELECT_STUDENTINFO = "SELECT * FROM student";
	
	
	private class StudentRowMapper implements RowMapper
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
	//name으로  id값 찾기위한 rowMapper 
	private class ForGetStudentIdByNameRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			/* 예외 처리해주어야함 */
			
			student student = new student();
			student.setStudentId(new Integer(rs.getInt("id")));
			return student;
		}
	}

	@Override
	public List getStudentinfo() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query(studentDaoimpl.SELECT_STUDENTINFO, new StudentRowMapper());
	}

	@Override
	public void setStudentsearchname(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Integer getIdByName(String name) {
		// TODO Auto-generated method stub
		String sql = "SELECT id FROM student WHERE name = ?";
		try{
			student student = (student)getJdbcTemplate().queryForObject(
					sql, new Object[] { name }, 
					new ForGetStudentIdByNameRowMapper());
	
			Integer id = student.getStudentId();
			System.out.println("getted id by name = "+id);
			return id;
			
		}catch(EmptyResultDataAccessException e){
			return null;
		}
		
	}





	
	

}
