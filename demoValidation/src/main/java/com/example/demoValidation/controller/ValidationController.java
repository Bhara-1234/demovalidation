package com.example.demoValidation.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoValidation.model.User;

@Controller
public class ValidationController {
	
	@GetMapping(value="/register")
	public String getRegistration(Map<String,Object> model) {
		User user = new User();
		model.put("user",user);
		ArrayList<String> profission = new ArrayList<>();
		model.put("profissions", profission);
		return "Registration";
	}
	

}
