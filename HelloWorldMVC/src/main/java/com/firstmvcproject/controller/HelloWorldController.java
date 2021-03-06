package com.firstmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("In controller");
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("name", name);
		mv.addObject("message", message);
		return mv;
	}
	
	@RequestMapping("/ajax")
	public String ajaxResponse() {
		return "llego la respuesta desde el controller";
	}

}
