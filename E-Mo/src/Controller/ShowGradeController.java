package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;

public class ShowGradeController extends AbstractController{
	private GradeDaoImpl gradeDaoImpl;
	public void setGradeDaoImpl(GradeDaoImpl gradeDaoImpl)
	{
		this.gradeDaoImpl = gradeDaoImpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		 
		List gradeInfo = this.gradeDaoImpl.findAll();
		Map model = new HashMap();
		model.put("gradeInfo" , gradeInfo);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("showGrade");
		mav.addAllObjects(model);
		return mav;
	}

}
