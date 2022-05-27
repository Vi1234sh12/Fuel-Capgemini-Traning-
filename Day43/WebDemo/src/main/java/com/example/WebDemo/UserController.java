package com.example.WebDemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@PostMapping("/register")
	public String RegisterUser(ModelAttribute User )
	{
		return "index";
	}
	
	@GetMapping("/mainpage")
	public String mainpage(@RequestParam String Uname , HttpSession session  ) { //  When we use Model  its Stateless Appplication and Its  Store Value only Inside main Page 
		 
		session.setAttribute("fname", Uname);
		
		return "main";
	}
	
	@GetMapping("/moviepage")
	public String moviepage(HttpSession session , Model model) // Model means Store Value  for Temp 
	{
		
	    String name = (String)session.getAttribute("fname");
	    model.addAttribute("name", name);
	 
	 
	
	 
		return "movie";
	}
	
	@GetMapping("/sportpage")
	public String sportpage()
	{
		return "sport";
	}
	

}
