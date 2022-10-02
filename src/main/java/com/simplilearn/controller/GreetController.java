package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World!") String name, Model model) {

		// Business logic
		System.out.println("Parameter is $$:" + name);
		System.out.println("This is where your business logic runs");
		
		model.addAttribute("name", name);

		return "hello";
	}

}