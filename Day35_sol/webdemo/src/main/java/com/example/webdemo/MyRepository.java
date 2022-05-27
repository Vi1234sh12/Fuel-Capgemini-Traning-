package com.example.webdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRepository {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Spring boot Application";
		
	}
	
	@GetMapping("/helo")
	public String getMsg()
	{
		return "hello world";
	}

}
