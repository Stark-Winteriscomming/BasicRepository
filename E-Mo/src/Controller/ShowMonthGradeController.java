package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;
// 월별 성적 출력하기 위한 컨트롤러
public class ShowMonthGradeController extends AbstractController{
	private GradeDaoImpl gradeDaoImpl;
	public void setGradeDaoImpl(GradeDaoImpl gradeDaoImpl)
	{
		this.gradeDaoImpl = gradeDaoImpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		 
		Integer month = Integer.valueOf(arg0.getParameter("month"));
		List gradeInfo = this.gradeDaoImpl.findMonthGrade(month);
		Map model = new HashMap();
		model.put("gradeInfo" , gradeInfo);
		ModelAndView mav = new ModelAndView();
		
		//testing
		//arg0.setAttribute("month", month);
		mav.setViewName("showGrade");
		mav.addAllObjects(model);
		return mav;
	}

}

