package com.example.SpringSecurityOnlineShop;

public class Item {
	
	private String item_name;
	private int item_cost;
	
	public Item() {
		
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}
	
	public Item(String item_name, int item_cost) {
		super();
		this.item_name = item_name;
		this.item_cost = item_cost;
	}
	
	
   
}
