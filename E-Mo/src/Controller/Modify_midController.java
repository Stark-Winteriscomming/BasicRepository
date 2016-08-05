package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.student;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import dao.impl.studentfixDaoimpl;

public class Modify_midController extends AbstractController {
	
	private studentfixDaoimpl studentfixDaoimpl;
	
	private int studentId;
	private String studentName;
	private String call;
	private String address;
	private String sex;
	private String enroll_date;
	private String spec;
	private String father;
	private String mother;
	private String brother;
	private String sister;

	public void setStudentfixDaoimpl(studentfixDaoimpl studentfixDaoimpl)
	{
		this.studentfixDaoimpl = studentfixDaoimpl;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		studentId = Integer.parseInt(arg0.getParameter("id"));
		System.out.println("Á¢±Ù!!!!!!!!!!!!");
		System.out.println(studentId);
		
		studentName = arg0.getParameter("name");
		if(studentName == null || studentName == "")
		{
			studentName = "No name";
		}
		
		call = arg0.getParameter("call");
		if(call == null || call == "")
		{
			call = "...";
		}
		address = arg0.getParameter("address");
		if(address == null || address == "")
		{
			address = "...";
		}
		sex = arg0.getParameter("sex");
		if(sex == null || sex == "")
		{
			sex = "...";
		}
		enroll_date = arg0.getParameter("enroll_date");
		if(enroll_date == null || enroll_date == "")
		{
			 enroll_date = "...";
		}
		
		spec = arg0.getParameter("spec");
		if(spec == null || spec == "")
		{
			spec = "...";
		}
		
		father = arg0.getParameter("father");
		if(father == null || father =="")
		{
			father = "...";
		}
		mother = arg0.getParameter("mother");
		if(mother == null || mother =="")
		{
			mother = "...";
		}
		brother = arg0.getParameter("brother");
		if(brother == null || brother == "")
		{
			brother = "...";
		}
		sister = arg0.getParameter("sister");
		if(sister == null || sister == "")
		{
			sister = "...";
		}
		
		student student = new student();

		
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setCall(call);
		student.setAddress(address);
		student.setSex(sex);
		student.setEnroll_date(enroll_date);
		student.setSpec((spec));
		student.setFather(father);
		student.setMother(mother);
		student.setBrother(brother);
		student.setSister(sister);

		this.studentfixDaoimpl.updateStudent(student);
		
		ModelAndView mav = new ModelAndView("/modify_mid");		 
				
		return mav;
	}
}
