package com.losporocas.estagiagil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/")
	public String redirectHome() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String oi() {
		return "oi";
	}
}
