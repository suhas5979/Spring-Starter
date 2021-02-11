package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid ;
	private String lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	void compile() {
		System.out.println("Compiling Laptop "+ this);
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
}
