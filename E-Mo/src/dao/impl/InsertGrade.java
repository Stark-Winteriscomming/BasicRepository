package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class InsertGrade extends SqlUpdate
{
	public InsertGrade(DataSource ds){
		super(ds , "INSERT INTO grade(id, year , month , language , english , math) VALUES(?,?,?,?,?,?)");
		super.declareParameter(new SqlParameter("id",Types.INTEGER));
		super.declareParameter(new SqlParameter("year",Types.INTEGER));
		super.declareParameter(new SqlParameter("month",Types.INTEGER));
		super.declareParameter(new SqlParameter("language",Types.INTEGER));
		super.declareParameter(new SqlParameter("english",Types.INTEGER));
		super.declareParameter(new SqlParameter("math",Types.INTEGER));
		compile();
	}
}
