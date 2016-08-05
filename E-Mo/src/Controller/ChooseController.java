package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.chooseDaoimpl;
import dao.impl.studentDaoimpl;

public class ChooseController extends AbstractController{
	
	private chooseDaoimpl chooseDaoimpl;
	public void setChooseDaoimpl(chooseDaoimpl chooseDaoimpl)
	{
		this.chooseDaoimpl = chooseDaoimpl;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List studentidname = this.chooseDaoimpl.getStudentinfo();		
		Map model = new HashMap();
		model.put("studentidname",studentidname);
		ModelAndView mav = new ModelAndView("/modify");
		
				
		mav.addAllObjects(model);		
	
		return mav;
	}

}
