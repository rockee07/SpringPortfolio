package com.tap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
	@RequestMapping("/")
	String firstRequest() {
		return "test.html";
	}
	
	@RequestMapping("projects")
	String RequestProjects() {
		return "projects.html";
	}
	
	@RequestMapping("education")
	String RequestEducation() {
		return "education.html";
	}
	
	@RequestMapping("skills")
	String RequestSkills() {
		return "skills.html";
	}
	
	@RequestMapping("contact")
	String RequestContact() {
		return "contact.html";
	}
}
