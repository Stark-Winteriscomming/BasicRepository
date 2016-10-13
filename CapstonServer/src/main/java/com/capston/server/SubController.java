package com.capston.server;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class SubController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/CapstonServer/android", method = RequestMethod.POST)
	public @ResponseBody void home(HttpServletRequest request , Locale locale, Model model) {
		logger.info("Welcome home2! The client locale is {}.", locale);
//		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
//	            .getRequestAttributes()).getRequest();
		try{
			String data = null;
			
			InputStream is = request.getInputStream();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			//out.flush();
			//inputstream outputstream 통로 독립적인지 확인 
			

			
			byte buf[] = new byte[1024];
			int letti;
			
			while((letti = is.read(buf)) > 0)
				baos.write(buf,0,letti);
			
			data = new String(baos.toByteArray(),"utf-8");
			//String jsonString = "{ \"name\" : \"John\", \"age\" : \"20\", \"address\" : \"some address\" }";
			
			
			JSONParser parser = new JSONParser();
			//String myJSONString = "{'test': '100.00'}";
			//JSONObject jobj = new Gson().fromJson(myJSONString, JSONObject.class);

			JSONObject obj = (JSONObject)parser.parse(data);
			String name = (String)obj.get("name");
		//
			String id = (String)obj.get("id");
			String password = (String)obj.get("password");
		//	
			//System.out.println(data);
			//JsonObject에서 문자열을 추출
			//System.out.println("name: "+name);
			//String name = json.get("name"); //type 에는 "test"라는 문자열이 저장된다
			System.out.println("received data"+data);
			//System.out.println("name value: "+name);
			System.out.println("requestGetcontextPath: "+ request.getContextPath());
			
			//inputData를 위한 forward
//			request.setAttribute("name",name);
//			request.setAttribute("id",id);
//			request.setAttribute("password",password);
//			
//			RequestDispatcher dispatcher = request.getRequestDispatcher("inputData.jsp");
//			dispatcher.forward(request,response);
			
			//System.out.println("request.getcontextPath: "+ request.getContextPath());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	    
		
	}
}
