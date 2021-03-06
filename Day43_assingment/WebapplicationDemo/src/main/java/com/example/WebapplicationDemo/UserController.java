package com.example.WebapplicationDemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String gotoindex()
	{
		return "index";
	}
	
	@GetMapping("/mainpage")
	public String gotoMain(@RequestParam String Uname , HttpSession session)
	{
		session.setAttribute("fname", Uname);
		return "main";
	}
	
	
	@GetMapping("/moviepage")
	public String gotomovie(HttpSession session , Model model)
	{
		String name =(String) session.getAttribute("fname");
		model.addAttribute("fname", name);
		return "movie";
	}
	
	
	@GetMapping("/sportpage")
	public String gotosport()
	{
		return "sport";
	}

}
