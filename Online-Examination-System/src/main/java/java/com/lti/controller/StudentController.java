package java.com.lti.controller;



import java.com.lti.exception.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.com.lti.modelEntity.Student;

import java.com.lti.service.StudentService;

@Controller
@SessionAttributes("loggedInUser")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/login.lti",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,
			@RequestParam("password") String password,ModelMap model) {
			
		try {
			System.out.println("1.");
			Student student=studentService.login(email, password);
			
			model.put("loggedInUser",student);
			return "Subject.jsp";
		}
			catch(LoginException e) {
		    model.put("loginmsg1","Invalid Credentials");
			return "Login.jsp";
			
		}
		
	}
	
	@RequestMapping(path="/login1.lti",method=RequestMethod.POST)
	public String add(Student student) {
		System.out.println("control");
		studentService.add(student);
		return "Login.jsp";
	}
}

