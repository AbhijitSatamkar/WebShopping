package com.abhi.webshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pagecontroller {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
}
