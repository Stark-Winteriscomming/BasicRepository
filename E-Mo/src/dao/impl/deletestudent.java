package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class deletestudent extends SqlUpdate{
	public deletestudent(DataSource ds)
	{
		super(ds,"DELETE FROM student where id=?");
		super.declareParameter(new SqlParameter("ID",Types.INTEGER));
		compile();
	}

}
