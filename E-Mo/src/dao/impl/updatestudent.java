package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class updatestudent extends SqlUpdate{
	public updatestudent(DataSource ds)
	{
		super(ds,"UPDATE student set NAME=?,PHONE_NUM=?,ADDRESS=?,SEX=?,ENROLL_DATE=?,SPEC=?,FATHER=?,MOTHER=?,BROTHER=?,SISTER=? where ID=?");
		super.declareParameter(new SqlParameter("NAME",Types.VARCHAR));
		super.declareParameter(new SqlParameter("PHONE_NUM",Types.VARCHAR));
		super.declareParameter(new SqlParameter("ADDRESS",Types.VARCHAR));
		super.declareParameter(new SqlParameter("SEX",Types.VARCHAR));
		super.declareParameter(new SqlParameter("ENROLL_DATE",Types.VARCHAR));
		super.declareParameter(new SqlParameter("SPEC",Types.VARCHAR));
		super.declareParameter(new SqlParameter("FATHER",Types.VARCHAR));
		super.declareParameter(new SqlParameter("MOTHER",Types.VARCHAR));
		super.declareParameter(new SqlParameter("BROTHER",Types.VARCHAR));
		super.declareParameter(new SqlParameter("SISTER",Types.VARCHAR));
		super.declareParameter(new SqlParameter("ID",Types.INTEGER));
		compile();
	}

}
