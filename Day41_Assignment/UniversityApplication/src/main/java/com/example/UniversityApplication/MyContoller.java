package com.example.UniversityApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MyContoller {
	
	@Autowired
	StudentRepsoitory studrepo;
	
	
	@PostMapping("/createuser")
	public String CraeteUser(@ModelAttribute Student create)
	{
		
		studrepo.save(create);
		return "create";
		
	}
	
//	@GetMapping("/loginuser")
//	public String LoignUser()
//	{
//		
//		
//		return "login";
//		
//	}
	
	@GetMapping("/welcome")
	public String Show()
	{  

		return "result";
	}
	
	
}
