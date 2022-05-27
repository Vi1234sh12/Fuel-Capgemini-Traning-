package com.example.LoginPage;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginPage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String Uname;
  private String Password;
  private String email_id;
	
	
	public LoginPage() {
		
	}
	
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public LoginPage(int id, String uname, String password, String email_id) {
		super();
		this.id = id;
		Uname = uname;
		Password = password;
		this.email_id = email_id;
	}


	
	
	
	
   
	
}
