package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.student;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.studentfixDaoimpl;

public class Delete_midController extends AbstractController{
	
	private studentfixDaoimpl studentfixDaoimpl;
	private int studentId;
	
	public void setStudentfixDaoimpl(studentfixDaoimpl studentfixDaoimpl)
	{
		this.studentfixDaoimpl = studentfixDaoimpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		studentId = Integer.parseInt(arg0.getParameter("id"));
		
		student student = new student();
		student.setStudentId(studentId);
		
		System.out.println(studentId);
		this.studentfixDaoimpl.deleteStudent(student);
		
		
		ModelAndView mav = new ModelAndView("/delete_mid");		
	
		return mav;
	}

}
