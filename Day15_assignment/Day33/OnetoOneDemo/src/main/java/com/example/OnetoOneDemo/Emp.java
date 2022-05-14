package com.example.OnetoOneDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp {
	
	@Id
	private int emp_id;
	@Column
	private String name;
	
	@OneToOne
	@JoinColumn(name = "roll_id")
	private Role rollobj;

	public Emp() {
		
	}

	public Emp(int emp_id, String name, Role rollobj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.rollobj = rollobj;
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

	public Role getRollobj() {
		return rollobj;
	}

	public void setRollobj(Role rollobj) {
		this.rollobj = rollobj;
	}
	
	
	
	
	

}
