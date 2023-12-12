package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
	
	@RequestMapping("/")
	public String Home(){
		System.out.println("This is my home page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		System.out.println();
		return "contact";
	}

}
