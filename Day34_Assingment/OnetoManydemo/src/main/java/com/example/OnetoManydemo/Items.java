package com.example.OnetoManydemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	
	@Id
	private int items_id;
	@Column
	private String items_des;
	private int items_cost;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cartobj;

	public Items() {
		
	}
	
	

	public int getItems_id() {
		return items_id;
	}



	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}



	public String getItems_des() {
		return items_des;
	}



	public void setItems_des(String items_des) {
		this.items_des = items_des;
	}



	public int getItems_cost() {
		return items_cost;
	}



	public void setItems_cost(int items_cost) {
		this.items_cost = items_cost;
	}



	public Cart getCartobj() {
		return cartobj;
	}



	public void setCartobj(Cart cartobj) {
		this.cartobj = cartobj;
	}



	public Items(int items_id, String items_des, int items_cost, Cart cartobj) {
		super();
		this.items_id = items_id;
		this.items_des = items_des;
		this.items_cost = items_cost;
		this.cartobj = cartobj;
	}
	
	
	
	

}
