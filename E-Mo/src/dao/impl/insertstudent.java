package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class insertstudent extends SqlUpdate {

		public insertstudent(DataSource ds)
		{
			super(ds,"INSERT INTO student (NAME,PHONE_NUM,ADDRESS,SEX,ENROLL_DATE,SPEC,FATHER,MOTHER,BROTHER,SISTER) VALUES(?,?,?,?,?,?,?,?,?,?)");
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
			compile();
		}
}
