package com.renu.bootwebflowsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index(Model model) {
		model.addAttribute("message", "Hello, world!");
		return "home";
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login(Model model) {
		model.addAttribute("message", "Hello, world!");
		return "login";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello, world!");
		return "hello";
	}
	
	
}
