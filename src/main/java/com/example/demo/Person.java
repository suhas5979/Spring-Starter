package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int P_id;
	private String P_name ;
	@Autowired
	private Laptop laptop ;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	
	void show() {
		System.out.println("In person show");
		laptop.compile();
	}
	
}
