package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Grade;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;
import dao.impl.studentDaoimpl;



public class InsertGradeController extends AbstractController{
	private GradeDaoImpl gradeDaoImpl;
	private studentDaoimpl studentDaoImpl;
//	private Grade grade;
	public void setGradeDaoImpl(GradeDaoImpl gradeDaoImpl)
	{
		this.gradeDaoImpl = gradeDaoImpl;
	}
	
//	public void setGrade(Grade grade)
//	{
//		this.grade = grade;
//	}
	public void setStudentDaoImpl(studentDaoimpl studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		Integer id;
		String getName  = (String)(arg0.getParameter("name"));
		int getYear = Integer.valueOf(arg0.getParameter("year"));
		int getMonth = Integer.valueOf(arg0.getParameter("month"));
		int getLanguage = Integer.valueOf(arg0.getParameter("language"));
		int getEnglish = Integer.valueOf(arg0.getParameter("english"));
		int getMath = Integer.valueOf(arg0.getParameter("math"));
		
		id = studentDaoImpl.getIdByName(getName);
		
		Grade grade = new Grade();
		grade.setId(id);
		grade.setYear(getYear);
		grade.setMonth(getMonth);
		grade.setLanguage(getLanguage);
		grade.setEnglish(getEnglish);
		grade.setMath(getMath);
		
		gradeDaoImpl.insertGrade(grade);
//		System.out.println("id : " + arg0.getParameter("id"));
//		int n = Integer.valueOf(arg0.getParameter("id"));
//		System.out.println("n = " + n);
		ModelAndView mav = new ModelAndView();

		//return "redirect:/getList";
		mav.setViewName("registerGrade_forward");
		return mav;
	}

}
