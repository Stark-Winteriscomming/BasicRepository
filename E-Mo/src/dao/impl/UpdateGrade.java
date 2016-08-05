package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class UpdateGrade extends SqlUpdate
{
	
	private static String SQL_UPDATE_GRADE = "UPDATE grade SET year = ? , month = ? , language = ?, english = ? , math = ?" +
			" WHERE id = ?";
			
	public UpdateGrade(DataSource ds){
		super(ds ,SQL_UPDATE_GRADE);
		super.declareParameter(new SqlParameter("year",Types.INTEGER));
		super.declareParameter(new SqlParameter("month",Types.INTEGER));
		super.declareParameter(new SqlParameter("language",Types.INTEGER));
		super.declareParameter(new SqlParameter("english",Types.INTEGER));
		super.declareParameter(new SqlParameter("math",Types.INTEGER));
		super.declareParameter(new SqlParameter("id",Types.INTEGER));
		compile();
	}
}
