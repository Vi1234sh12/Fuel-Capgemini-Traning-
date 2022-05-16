package com.example.OnetoOneChoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	
	@Id
	private int emp_id;
	@Column
	private String name;
	
	@OneToOne
	@JoinColumn(name= "role_id")
	private Role roleobj;

	public Emp() {
		
	}
	
	
	

	public int getEmp_id() {
		return emp_id;
	}




	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Role getRoleobj() {
		return roleobj;
	}




	public void setRoleobj(Role roleobj) {
		this.roleobj = roleobj;
	}




	public Emp(int emp_id, String name, Role roleobj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.roleobj = roleobj;
	}
	
	
	

}
