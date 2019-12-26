//package com.lti.controller;
//
//
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//
//
//@Controller
//@SessionAttributes("xyz")
//public class Test2 {
//	
//	@RequestMapping(path="/abc.lti")
//	public String testSessionVariable(ModelMap model,@RequestParam("link") String name) {
//		
//		model.put("xyz",name);
//		return "sub.jsp";
//	}
//
//}
