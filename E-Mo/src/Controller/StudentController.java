package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.studentDaoimpl;

public class StudentController extends AbstractController{
	
	private studentDaoimpl studentDaoimpl;
	public void setStudentDaoimpl(studentDaoimpl studentDaoimpl)
	{
		this.studentDaoimpl = studentDaoimpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List studentinfo = this.studentDaoimpl.getStudentinfo();		
		Map model = new HashMap();
		model.put("studentinfo",studentinfo);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/student");
				
		mav.addAllObjects(model);		
	
		return mav;
	}

}
