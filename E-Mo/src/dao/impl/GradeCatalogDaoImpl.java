package dao.impl;

import java.util.List;

import dao.*;

public class GradeCatalogDaoImpl implements GradeCatalogDao {
//	private itemDaoimpl itemDaoimpl;
	private GradeDaoImpl gradeDaoImpl;
	public void setGradeDaoImpl(GradeDaoImpl gradeDaoImpl)
	{
		this.gradeDaoImpl = gradeDaoImpl;
	}
	@Override
	public List getGradeList() {
		// TODO Auto-generated method stub
		return this.gradeDaoImpl.findAll();
	}
	
}