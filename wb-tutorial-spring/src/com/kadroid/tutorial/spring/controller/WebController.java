package com.kadroid.tutorial.spring.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {
	
	@RequestMapping("/inicio.htm") 
	public ModelAndView Inicio(HttpServletRequest req) throws Exception {
		
		return new ModelAndView("inicio");
	}

}
