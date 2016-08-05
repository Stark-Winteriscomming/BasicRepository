package dao;

import java.util.List;

import model.user;



public interface userDao {
	List getUserinfo();
	String getCompareinfo(String getuserId, String getuserPwd); // +
}
