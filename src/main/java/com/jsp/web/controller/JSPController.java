package com.jsp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {
	
	@RequestMapping(value="/")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		//page to go to
		view.setViewName("index.jsp");
		//$variable , value of variable
		view.addObject("title", "JPSTEST");
		view.addObject("dr","9th Doctor");
		return view;

	}
	
}

