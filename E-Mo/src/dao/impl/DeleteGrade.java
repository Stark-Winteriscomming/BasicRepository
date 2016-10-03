package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class DeleteGrade extends SqlUpdate{
	private static String SQL_DELETE_PLAYER = "DELETE FROM grade WHERE id = ? AND month = ?";
	
	public DeleteGrade(DataSource ds){
		super(ds,SQL_DELETE_PLAYER);
		super.declareParameter(new SqlParameter("id" , Types.INTEGER));
		super.declareParameter(new SqlParameter("month" , Types.INTEGER));
		compile();
	}
}
