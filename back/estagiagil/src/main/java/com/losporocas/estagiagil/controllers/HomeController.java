package com.losporocas.estagiagil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
