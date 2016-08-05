package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.user;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.userDao;


public class userDaoimpl extends JdbcDaoSupport implements userDao{
	
	private static final String SELECT_USERINFO = "select t_id, password, name FROM teacher";
	private static final String FAIL = "FAIL";
	//user user;
	private class UserRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			/* Item 객체에 저장 (Set/Get 함수를 통해서)*/
			user user = new user();
			user.setUserId(rs.getString("t_id"));
			user.setUserPwd(new Integer(rs.getInt("password")));
			user.setUserName(rs.getString("name"));
			return user;
		}
	}
	
	@Override
	public List getUserinfo() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query(userDaoimpl.SELECT_USERINFO+";", new UserRowMapper());
	}
	
	//testing 
	@Override
	public String getCompareinfo(String userId, String userPwd) {
		String sql = "SELECT * FROM TEACHER WHERE T_ID = ?";
		try{
			user user = (user)getJdbcTemplate().queryForObject(
					sql, new Object[] { userId }, 
					new UserRowMapper());
	
			String id = user.getUserId();
			int pwd  = user.getUserPwd();
			System.out.println("id = "+id);
			System.out.println("pwd = "+pwd);
			
			if(pwd == Integer.parseInt(userPwd)){
				return user.getUserName();
			}
			else{
				return "password_fail";
			}
			
		}catch(EmptyResultDataAccessException e){
			return "id_fail";
		}
		
	}
		//

//	@Override
//	public String getCompareinfo(String userId, String userPwd) {
//		// TODO Auto-generated method stub
//		List confirm = getJdbcTemplate().query(userDaoimpl.SELECT_USERINFO, new UserRowMapper());
//		Map model = new HashMap();
//		
//		//this.getId = getuserId;
//		//String dbId = user.getUserId();
//		//String dbPwd = Integer.toString(user.getUserPwd());
//		confirm.get
////		getJdbcTemplate().query(userDaoimpl.SELECT_USERINFO, new UserRowMapper());
//		if(getId.equals(dbId) && getPwd.equals(dbPwd))
//		{
//			return user.getUserName();
//		}
//		else
//		{
//			return null;
//		}		
//		
//	}

}
