package com.suganya.program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView showMessage1(@RequestParam(value = "count", required = true, defaultValue = "1") int count,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name+calc(count));
		return mv;
	}
	
	private int calc (int c){
		return c*c;
	}
}