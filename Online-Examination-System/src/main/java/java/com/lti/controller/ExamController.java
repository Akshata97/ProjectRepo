package java.com.lti.controller;

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

@Controller
@SessionAttributes({"xyz","lev"})
public class ExamController {
	
	@Autowired
	ExamService examService;
	
//	@RequestMapping(path="/subjectAdd.lti", method = RequestMethod.POST)
//	public String add() {
//		session.getAttribute("id",id);
//		examService.add(ans);
//		return "";
//		
//	}
	
	@RequestMapping(path="/abc.lti")
	public String subjectSessionVariable(ModelMap model,@RequestParam("link") String name) {
		
		model.put("xyz",name);
		return "Level.jsp";
	}
	
	@RequestMapping(path="/level.lti")
	public String levelSessionVariable(ModelMap model,@RequestParam("setlevel") String level) {
		
		model.put("lev",level);
		return "sub.jsp";
	}
	@RequestMapping(path="/level1.lti", method = RequestMethod.POST)
	public String addQuestionlevel1(Level1 level1,ModelMap model) {
		int subid= Integer.parseInt((model.get("xyz").toString()));
		examService.addQueslevel1(level1,subid);
		for(int i=0;;i++)
		return "sub.jsp";
		
	}
	
	@RequestMapping(path="/level2.lti", method = RequestMethod.POST)
	public String addQuestionlevel2(Level2 level2,ModelMap model) {	
		int subid= Integer.parseInt((model.get("xyz").toString()));
		examService.addQueslevel2(level2,subid);
		for(int i=0;;i++)
		return "sub.jsp";
		
	}
	
	@RequestMapping(path="/level3.lti", method = RequestMethod.POST)
	public String addQuestionlevel3(Level3 level3,ModelMap model) {				
		int subid= Integer.parseInt((model.get("xyz").toString()));
		examService.addQueslevel3(level3,subid);
		for(int i=0;;i++)
		return "sub.jsp";
		
	}
//	@RequestMapping(path="/answer.lti", method = RequestMethod.POST)
//	public String addAnswer(List<Answer1> answer1) {
//		examService.addQues(level1);
//	}

}
