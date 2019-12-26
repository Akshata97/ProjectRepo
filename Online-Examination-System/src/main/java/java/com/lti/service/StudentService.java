package java.com.lti.service;

import java.com.lti.exception.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.com.lti.modelEntity.Student;
import java.com.lti.repo.StudentRepo;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;


public Student login(String email,String password) throws LoginException{
		
		
		try
		{
			Student student=studentRepo.fetch(email,password);
			return student;
		}
		catch(Exception e) {
			throw new LoginException("Invalid Customer credentials",e);
		}
	}


public void add(Student student) {
	studentRepo.add(student);
}

}
