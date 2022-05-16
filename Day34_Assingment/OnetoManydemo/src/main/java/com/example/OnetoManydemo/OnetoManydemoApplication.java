package com.example.OnetoManydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoManydemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context ;
		context =  SpringApplication.run(OnetoManydemoApplication.class, args);
	
	   CartRepository cart = context.getBean(CartRepository.class);
	   ItemsRepository item = context.getBean(ItemsRepository.class);
	   
	   
	   Cart c1 = new Cart(1,"abc");
	   cart.save(c1);
	   System.out.println("Cart Save Successfully !");
	   
	   Items  i1 = new Items(100,"keyboard",800,c1);
	   item.save(i1);
	   System.out.println("Items Save Successfully !");
	   
	   
	}

}
