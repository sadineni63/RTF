package com.rtf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@RequestMapping("/showMessage")
	public ModelAndView message() {
		
		ModelAndView view=new ModelAndView("showMessage");
		view.addObject("message", "welcome to spring application");
		
		return view;
	}

}
