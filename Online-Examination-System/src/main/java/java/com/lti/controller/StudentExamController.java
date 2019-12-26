package java.com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.com.lti.modelEntity.Level1;
import java.com.lti.modelEntity.Level2;
import java.com.lti.modelEntity.Level3;
import java.com.lti.service.ExamService;
import java.com.lti.service.StudentExamService;

@Controller
@SessionAttributes({"subjectchoice","questions","qno","counter"})
public class StudentExamController {
	
	@Autowired
	StudentExamService studentexamService;
	
	
	
	@RequestMapping(path="/subjectoption.lti")
	public String subjectSessionVariable(ModelMap model,@RequestParam("link") String name) {
		
		model.put("subjectchoice",name);
		return "startexam.jsp";
	}
	
	
	@RequestMapping(path="/examlevel1.lti", method = RequestMethod.POST)
	public String addQuestionlevel1(ModelMap model) {
		int subid= Integer.parseInt((model.get("subjectchoice").toString()));
		List<Level1>list=studentexamService.displayQueslevel1(subid);
		//logic of picking 5/10/15/20 random questions from above list will be here
		model.put("questions", list);
		
		return "redirect:getquestion.lti";
		
	}
	
	@RequestMapping(path = "/getquestion.lti")
	public String getQuestion(ModelMap model) {
		List<Level1> list = (List<Level1>) model.get("questions");
		Integer qno = (Integer) model.get("qno");
		if(qno == null)
			qno = 0;
		else
			qno ++;
		model.put("qno", qno);				
		while(qno<3)
		{	
			Level1 q = list.get(qno);
			model.put("currentQs", q);
			Integer count = (Integer) model.get("counter");
			System.out.println(count);
			return "viewquestion.jsp";
		}
		return"viewresult.jsp";
		
	}
	
	
	  @RequestMapping(path="/score.lti", method = RequestMethod.POST)
	  public String calculatescore(ModelMap model,@RequestParam("ans")String ans) { 
		 
		
		  List<Level1> list = (List<Level1>) model.get("questions");
		  Integer qno = (Integer) model.get("qno");
		  Level1 q = list.get(qno);
		  String answer=q.getFlag();
		  Integer count = (Integer) model.get("counter");
		  if(count == null)
			  count=0;
		  if(ans.equals(answer)) {		  		 		  		 
			  count ++;
			  model.put("counter", count);		  
		  }
		  return "redirect:getquestion.lti"; 
	  }
	 
	

}
