package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.GradeDaoImpl;

public class RegisterGradeController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/registerGrade_new");
			return mav;
	}

}
