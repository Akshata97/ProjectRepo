package java.com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.com.lti.modelEntity.Level1;
import java.com.lti.modelEntity.Level2;
import java.com.lti.modelEntity.Level3;
import java.com.lti.modelEntity.Subject;
import java.com.lti.repo.ExamRepo;

@Service
public class ExamService {
	@Autowired
	private ExamRepo examRepo;
//	public void add(Answer1 ans) {
//		examRepo.add(ans);
//	}
	public void addQueslevel1(Level1 level1,int subid) {
		examRepo.addQueslevel1(level1,subid);
		
	}
	public void addQueslevel2(Level2 level2,int subid) {
		examRepo.addQueslevel2(level2,subid);
		
	}
	public void addQueslevel3(Level3 level3,int subid) {
		examRepo.addQueslevel3(level3,subid);
		
	}

}
