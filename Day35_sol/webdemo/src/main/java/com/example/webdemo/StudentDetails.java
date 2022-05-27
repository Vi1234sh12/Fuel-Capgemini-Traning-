package com.example.webdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentDetails {
	
	//@Autowired
	private Student stud;
	
	
	
	
	
	
	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}


	void setData()
	{
		stud.setId(100);
		stud.setName("abc");
		
	}
	
	
	void showData()
	{
		System.out.println(stud.getId());
       System.out.println(stud.getName());
		
	}
	

}
