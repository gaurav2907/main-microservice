package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@Value("${config.value1}")
	private String value1;
	
	@Value("${config.value2}")
	private String value2;
	
	@Value("${config.value3}")
	private String value3;
	
	@RequestMapping("/")
	public String show(){
		
		
		return value3;
	}
	
	@RequestMapping("/showUser")
	public String showUser(){
		
		
		return value2;
	}
	
	@RequestMapping("/showAdmin")
	public String showAdmin(){
		
		
		return value1;
	}

}
