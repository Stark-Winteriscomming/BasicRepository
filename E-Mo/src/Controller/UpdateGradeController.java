package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Grade;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;



public class UpdateGradeController extends AbstractController{
	private GradeDaoImpl gradeDaoImpl;
//	private Grade grade;
	public void setGradeDaoImpl(GradeDaoImpl gradeDaoImpl)
	{
		this.gradeDaoImpl = gradeDaoImpl;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		int getId = Integer.parseInt(arg0.getParameter("id"));
		int getYear = Integer.parseInt(arg0.getParameter("year"));
		int getMonth = Integer.parseInt(arg0.getParameter("month"));
		int getLanguage = Integer.parseInt(arg0.getParameter("language"));
		int getEnglish = Integer.parseInt(arg0.getParameter("english"));
		int getMath = Integer.parseInt(arg0.getParameter("math"));
		
		System.out.println(getId);
		System.out.println(getYear);
		System.out.println(getMonth);
		System.out.println(getLanguage);
		System.out.println(getEnglish);
		System.out.println(getMath);
		
		Grade grade = new Grade();
		grade.setYear(getYear);
		grade.setMonth(getMonth);
		grade.setLanguage(getLanguage);
		grade.setEnglish(getEnglish);
		grade.setMath(getMath);
		grade.setId(getId);
		
		gradeDaoImpl.updateGrade(grade);
		
		ModelAndView mav = new ModelAndView();

		mav.setViewName("updateGrade_forward");
		return mav;
	}

}
