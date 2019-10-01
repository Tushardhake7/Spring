package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.exceptionHandle.ValidationException;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/hello")
	public String sayhello() {
		throw new ValidationException("Invalid...");	
	} 

	/*	@GetMapping("/hello")
	public String sayHello() {

		return "hello";
	}
	 */

	@GetMapping("/welcometohome/{name}") 
	public ModelAndView sayHelloByName(@PathVariable("name") String name) { 
		ModelAndView modelAndView = new ModelAndView();  
		modelAndView.addObject("userName", name);
		modelAndView.setViewName("welcome");
		return modelAndView; 
	}

}
