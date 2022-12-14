package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.publisher.SweetEventPublisher;

@Controller
public class SweetController {

	@Autowired
	SweetEventPublisher publisher;
	
	@GetMapping("/buycar")
	public String buyCar() {
		this.publisher.publishSweetEvent();
		return "sweetPublished";
	}
	
}
