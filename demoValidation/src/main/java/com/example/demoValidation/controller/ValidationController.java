package com.example.demoValidation.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoValidation.model.User;

@Controller
public class ValidationController {
	
	@GetMapping(value="/register")
	public String getRegistration(Map<String,Object> model) {
		User user = new User();
		model.put("user",user);
		ArrayList<String> profission = new ArrayList<>();
		profission.add("plumber");
		profission.add("doctor");
		profission.add("engineer");
		model.put("profissions", profission);
		return "Registration";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String sendDetails(@Valid @ModelAttribute("user") User user,BindingResult br) {
		if(br.hasErrors()) {
			return "Registration";
		}
		else {
		return "RegistrationSuccess";
		
	}
	}

}
