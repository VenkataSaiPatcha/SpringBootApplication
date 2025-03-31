package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerApplication 
{
	@RequestMapping("/")
	
	public String greet()
	{
		return "Welcome to Home page !!!";
	} 
	
	@RequestMapping("/about")
	
	public String about()
	{
		return "An error is a deviation from accuracy ";
	}
				
}
