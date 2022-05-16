package com.example.OnetoManydemo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	private int Cart_id;
	@Column
	private String Uname;
	
	
	@OneToMany(mappedBy = "cartobj")
	
	//  package required 
	private Set<Items> items;


	public Cart() {
		
	}


	public int getCart_id() {
		return Cart_id;
	}


	public void setCart_id(int cart_id) {
		Cart_id = cart_id;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	


	public Cart(int cart_id, String uname ) {
		
		Cart_id = cart_id;
		Uname = uname;
		
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

}
