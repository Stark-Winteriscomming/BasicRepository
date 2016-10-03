package dao.impl;

import java.util.List;

import dao.GradeShowDao;



public class GradeShowDaoImpl implements GradeShowDao{
	private GradeCatalogDaoImpl gradeCatalogDaoImpl;
	
	/* itemcatalog변수를 선언하고, Setting해줌 */
	public void setGradeCatalogDaoImpl(GradeCatalogDaoImpl gradeCatalogDaoImpl)
	{
		this.gradeCatalogDaoImpl = gradeCatalogDaoImpl;
	}
	
	/* Shop interface의 getItemList를 구체화 */
	@Override
	public List getGradeList() {
		// TODO Auto-generated method stub
		return this.gradeCatalogDaoImpl.getGradeList();
	}
}
