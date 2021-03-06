package com.example.SpringSecurityOnlineShop;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShopController {
	
	
	@GetMapping("/nextpage")
	public String goToNext(HttpSession session)
	{
		Item it1 = new Item("A",100);
		Item it2 = new Item("B",200);
		Item it3 = new Item("C",300);
		Item it4 = new Item("D",400);
		Item it5 = new Item("E",500);
		Item it6 = new Item("F",600);
		
		List<Item> dbitems = new ArrayList<>();
		dbitems.add(it1);
		dbitems.add(it2);
		dbitems.add(it3);
		dbitems.add(it4);
		dbitems.add(it5);
		dbitems.add(it6);
		
		session.setAttribute("iteminfo", dbitems);
		
		List<Item> items = new ArrayList<>();
		session.setAttribute("cart", items);
		
		
		return "index";
	}
	
	
	@GetMapping("/resultpage")
	public String goToResult(@RequestParam List<String> arr , HttpSession session)
	{
		Item it1 = new Item("A",100);
		Item it2 = new Item("B",200);
		Item it3 = new Item("C",300);
		Item it4 = new Item("D",400);
		Item it5 = new Item("E",500);
		Item it6 = new Item("F",600);
		
		List<Item> dbitems = new ArrayList<>();
		dbitems.add(it1);
		dbitems.add(it2);
		dbitems.add(it3);
		dbitems.add(it4);
		dbitems.add(it5);
		dbitems.add(it6);
		
		session.setAttribute("iteminfo", dbitems);
		
		List<Item> items = new ArrayList<>();
		session.setAttribute("cart", items);
		
		List<Item> db = (List<Item>) session.getAttribute("iteminfo");
		
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		
		for(String s : arr)
		{
			for(Item item : db)
			{
				if(item.getItem_name().equals(s))
				{
					Item it = new Item(item.getItem_name(),item.getItem_cost());
					cart.add(it);
				}
			}
			
			
		}
		
		session.setAttribute("cart", cart);
		return "result";
	}
	
	
	@GetMapping("/checkout")
	public String checkout(HttpSession session , Model model )
	{
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		
		int total = 0 ;
		for(Item item:cart)
		{
			System.out.println(item.getItem_name()+"=>"+item.getItem_cost());
			model.addAttribute("item", item);
			total += item.getItem_cost();
		}
		
		System.out.println("Total Cost is "+total);
		model.addAttribute("total",total);
		model.addAttribute("cart",cart);
		
		
		return "checkout";
	}
	
	

}
