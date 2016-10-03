package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.searchDaoimpl;

public class Search_midController extends AbstractController{
	private searchDaoimpl searchDaoimpl;
	
	public void setSearchDaoimpl(searchDaoimpl searchDaoimpl)
	{
		this.searchDaoimpl = searchDaoimpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		String studentName = arg0.getParameter("studentName");
		searchDaoimpl.setStudentsearchname(studentName);
		List studentinfo = this.searchDaoimpl.getStudentinfo();		
		Map model = new HashMap();
		model.put("studentinfo",studentinfo);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/search");
				
		mav.addAllObjects(model);		
	
		return mav;
	}

}
