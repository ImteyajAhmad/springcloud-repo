package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ConfigProps;

@RestController
public class MyController {
	
	@Autowired
	private ConfigProps configProps;
	@RequestMapping("/displayProperties")
public String displayProperties() {
		return "userNane:"+configProps.getUsername()+" Password :"+configProps.getPassword()+" attempt :"+configProps.getAttempt();
	
}
}
