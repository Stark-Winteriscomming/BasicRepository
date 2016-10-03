package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Grade;
import model.user;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import dao.GradeDao;


public class GradeDaoImpl extends JdbcDaoSupport implements GradeDao{
	/* Query  */
	private static final String SELECT_MONTH_GRADE = "select s.name,  g.language, g.english, g.math ,g.rank_lan , g.rank_eng , g.rank_mat , g.rank_all FROM Student s , Grade g WHERE g.month ";
	private static final String SELECT_MONTH_GRADE_REMAINDER = "AND s.id=g.id";
	//view ����
	//private static final String CREATE_VIEW = "create view test2 as select id from grade where month=2";
	
	//join 
	private static final String JOIN = "";
	
	private static final String SELECT_PER_MONTH_GRADE = "select s.name,  g.language, g.english, g.math ,g.rank_lan , g.rank_eng , g.rank_mat , g.rank_all FROM Student s , Grade g WHERE g.month=";
	private static final String SELECT_PER_MONTH_GRADE_REMAINDER = " AND s.id=g.id";
	
	private static final String SELECT_STUDENT_MONTH_GRADE = "select month ,language, english, math FROM grade where ";
	private InsertGrade insertGrade;
	private UpdateGrade updateGrade;
	private DeleteGrade deleteGrade;
	protected void initDao() throws Exception{
		this.insertGrade = new InsertGrade(getDataSource());
		this.updateGrade = new UpdateGrade(getDataSource());
		this.deleteGrade = new DeleteGrade(getDataSource());
	}
	private class GradeRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			/* Item ��ü�� ���� (Set/Get �Լ��� ���ؼ�)*/
			Grade grade = new Grade();
			user user = new user();
			// getInt(0) ���� ����
			grade.setName(rs.getString(1));
			grade.setLanguage(new Integer(rs.getInt(2)));
			grade.setEnglish(new Integer(rs.getInt(3)));
			grade.setMath(new Integer(rs.getInt(4)));
			grade.setRank_lan(new Integer(rs.getInt(5)));
			grade.setRank_eng(new Integer(rs.getInt(6)));
			grade.setRank_mat(new Integer(rs.getInt(7)));
			grade.setRank_all(new Integer(rs.getInt(8)));

			return grade;
		}
	}
	// �� �л� ���� ���� �̱����� mapRow
	private class MonthGradeRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			/* Item ��ü�� ���� (Set/Get �Լ��� ���ؼ�)*/
			Grade grade = new Grade();
			// getInt(0) ���� ����
			grade.setLanguage(new Integer(rs.getInt(1)));
			grade.setEnglish(new Integer(rs.getInt(2)));
			grade.setMath(new Integer(rs.getInt(3)));
			//grade.setRank_all(new Integer(rs.getInt(8)));

			return grade;
		}
	}
	
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query(GradeDaoImpl.SELECT_MONTH_GRADE+" =2 "+GradeDaoImpl.SELECT_MONTH_GRADE_REMAINDER, new GradeRowMapper());
	}
	//�� �л� ���� ���� , query�� ���� 
	@Override
	public List findGrade(Integer id){
		return getJdbcTemplate().query(GradeDaoImpl.SELECT_STUDENT_MONTH_GRADE+"id = "+id , new MonthGradeRowMapper());
	}
	//insert �κ�
	@Override
	public void insertGrade(Grade grade) throws DataAccessException{
		this.insertGrade.update(new Object[]{grade.getId(),grade.getYear() ,grade.getMonth(), grade.getLanguage() , grade.getEnglish() , grade.getMath()} );
	}
	//���� ������ ����ϱ� ���� �޼ҵ� 
	@Override
	public List findMonthGrade(Integer selectedMonth){
		return getJdbcTemplate().query(GradeDaoImpl.SELECT_PER_MONTH_GRADE + selectedMonth+GradeDaoImpl.SELECT_PER_MONTH_GRADE_REMAINDER, new GradeRowMapper());
	}
	// ������ ������Ʈ �ϱ� ���� �޼ҵ� 
	@Override
	public void updateGrade(Grade grade) throws DataAccessException{
		this.updateGrade.update(new Object[]{grade.getYear() , grade.getMonth() , grade.getLanguage() , grade.getEnglish() , grade.getMath(), grade.getId()} );
	}
	// ���� delete
	@Override
	public void deleteGrade(Grade grade) throws DataAccessException{
		this.deleteGrade.update(grade.getId() , grade.getMonth());
	}

}
