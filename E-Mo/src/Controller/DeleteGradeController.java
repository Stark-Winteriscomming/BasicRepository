package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Grade;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;



public class DeleteGradeController extends AbstractController{
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
		
		int getId = Integer.valueOf(arg0.getParameter("id"));
		int getMonth = Integer.valueOf(arg0.getParameter("month"));
		
		Grade grade = new Grade();
		grade.setId(getId);
		grade.setMonth(getMonth);
		
		gradeDaoImpl.deleteGrade(grade);
		ModelAndView mav = new ModelAndView();

		//return "redirect:/getList";
		mav.setViewName("deleteGrade_forward");
		return mav;
	}

}
