package com.tts.theproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String todo() {
		return "todo.html";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}
}
