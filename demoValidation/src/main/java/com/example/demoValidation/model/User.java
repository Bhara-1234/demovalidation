package com.example.demoValidation.model;

import javax.validation.constraints.*;

public class User {
	@NotBlank
	String name;
	String profission;
	
	public String getProfission() {
		return profission;
	}

	public void setProfission(String profission) {
		this.profission = profission;
	}

	@Email
	String email;
	
	@NotBlank
	@Size(min=7,max=10)
	String pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
