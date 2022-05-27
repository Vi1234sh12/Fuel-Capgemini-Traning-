package com.example.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context =  SpringApplication.run(WebdemoApplication.class, args);
		
		StudentDetails st = context.getBean(StudentDetails.class);
		
		st.setData();
		st.showData();
	}

}
