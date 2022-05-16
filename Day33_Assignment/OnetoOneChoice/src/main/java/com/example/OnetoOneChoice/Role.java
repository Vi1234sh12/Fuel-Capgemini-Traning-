package com.example.OnetoOneChoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role {
	
	@Id
	private int role_id;
	@Column
	private String role_desc;
	
	
	@OneToOne(mappedBy = "roleobj")
	private Emp emp;
	
	public Role() {
		
	}
	
	

	public int getRole_id() {
		return role_id;
	}



	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}



	public String getRole_desc() {
		return role_desc;
	}



	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}



	public Role(int role_id, String role_desc) {
		super();
		this.role_id = role_id;
		this.role_desc = role_desc;
	}
	
	
	
	

}
