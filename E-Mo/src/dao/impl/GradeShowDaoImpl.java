package dao.impl;

import java.util.List;

import dao.GradeShowDao;



public class GradeShowDaoImpl implements GradeShowDao{
	private GradeCatalogDaoImpl gradeCatalogDaoImpl;
	
	/* itemcatalog������ �����ϰ�, Setting���� */
	public void setGradeCatalogDaoImpl(GradeCatalogDaoImpl gradeCatalogDaoImpl)
	{
		this.gradeCatalogDaoImpl = gradeCatalogDaoImpl;
	}
	
	/* Shop interface�� getItemList�� ��üȭ */
	@Override
	public List getGradeList() {
		// TODO Auto-generated method stub
		return this.gradeCatalogDaoImpl.getGradeList();
	}
}
