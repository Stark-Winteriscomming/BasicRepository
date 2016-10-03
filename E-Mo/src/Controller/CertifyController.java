package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sun.msv.reader.Controller;

import dao.impl.userDaoimpl;


public class CertifyController extends AbstractController{
	private userDaoimpl userDaoimpl;
	public void setUserDaoimpl(userDaoimpl userDaoimpl)
	{
		this.userDaoimpl = userDaoimpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		 
		String getuserId = arg0.getParameter("userId");
		String getuserPwd = arg0.getParameter("userPwd");
		//testing
		System.out.println("userId : "+getuserId);
		System.out.println("userPwd : "+getuserPwd);
		
		List userinfo = this.userDaoimpl.getUserinfo();
		
		String result = this.userDaoimpl.getCompareinfo(getuserId, getuserPwd);
		
		System.out.println("result °ª : " + result);
		
		ModelAndView mav = new ModelAndView();
		
		
		/* ModelAndView view set */
		if(result.equals("id_fail")) // 
		{
			mav.setViewName("/login");
		}
		else
		{	
			if(result.equals("password_fail"))
				mav.setViewName("/login");
			else{
				arg0.setAttribute("userName", new String(result));
				mav.setViewName("/home");
				mav.addObject("cerifyresult", result);
			}
		}
		
		
		return mav;
	}
//	arg0.setAttribute("userName", new String(rtuserinfo));
//	System.out.println("userName: "+rtuserinfo);
//	mav.setViewName("/home");
//	mav.addObject("cerifyresult", rtuserinfo);
}
