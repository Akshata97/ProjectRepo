package java.com.lti.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.com.lti.modelEntity.Level1;
import java.com.lti.modelEntity.Level2;
import java.com.lti.modelEntity.Level3;
import java.com.lti.modelEntity.Subject;
import java.com.lti.repo.ExamRepo;
import java.com.lti.repo.StudentExamRepo;

@Service
public class StudentExamService {
	@Autowired
	private StudentExamRepo studentexamrepo;

	public List<Level1> displayQueslevel1(int subid) {
		return (studentexamrepo.displayQueslevel1(subid));	
		
	}
}
