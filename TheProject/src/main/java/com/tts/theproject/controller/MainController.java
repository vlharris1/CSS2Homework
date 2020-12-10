package com.tts.theproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.theproject.domain.Project;
import com.tts.theproject.repository.ProjectRepository;

@Controller
public class MainController {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping(value="/")
	public String index(Project task) {
		return "project/todo";
	}
	
	private Project task;
	@PostMapping(value="/")
	public String addNewTask(Project task, Model model) {
		projectRepository.save(new Project(task.getTask()));
		
		model.addAttribute("task", task.getTask());
		
		return "project/result";
	}
	
	@RequestMapping("/")
	public String todo() {
		return "todo.html";
	}
	
	@RequestMapping(value="/favorites")
	public String favorites() {
		return "favorites.html";
	}
}
