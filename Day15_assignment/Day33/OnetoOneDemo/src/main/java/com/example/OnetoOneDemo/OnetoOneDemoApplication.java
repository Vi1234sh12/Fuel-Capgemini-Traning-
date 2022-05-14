package com.example.OnetoOneDemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoOneDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context ;
		context = SpringApplication.run(OnetoOneDemoApplication.class, args);
		
		RoleRepository roll ;
		roll = context.getBean(RoleRepository.class);
		
		EmpRepository emp ;
		emp = context.getBean(EmpRepository.class);
		
		Role r1 = new Role(1,"admin");
		roll.save(r1);
		
		Emp e1 = new Emp(100,"abc",r1);
		emp.save(e1);
		
		Role r2 = new Role(2,"hr");
		roll.save(r2);
		
		Emp e2 = new Emp(200,"xyz",r2);
		emp.save(e2);
		
		
		List<Role> list;
		list = roll.findAll();
	
       for(Role r : list)
    	{
		System.out.println(r.getRoll_id()+" : "+r.getRoll_desc());
    			
	    }
       
       
       // Employee Table 
       
       List<Emp> list1 ;
       list1 = emp.findAll();
       
       for(Emp e : list1)
       {
    	   
    	   System.out.println(e.getRollobj().getRoll_id()+":"+ e.getName()+" : "+e.getEmp_id());
    	   
       }
       
	}

}
