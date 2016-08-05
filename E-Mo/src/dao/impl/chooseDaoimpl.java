package dao.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import model.student;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.studentDao;

public class chooseDaoimpl extends JdbcDaoSupport implements studentDao {
	
	
private static final String SELECT_STUDENTIDNAME = "SELECT * FROM student";
	
	private class ChooseRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			
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
		return getJdbcTemplate().query(chooseDaoimpl.SELECT_STUDENTIDNAME, new ChooseRowMapper());
	}

	@Override
	public void setStudentsearchname(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer getIdByName(String name){
		return null;
	}
}
