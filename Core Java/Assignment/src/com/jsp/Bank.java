package com.jsp;

import java.util.ArrayList;

public class Bank {
	private String name;
	private String location;
	private static ArrayList<Bank> bankList= new ArrayList<Bank>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Bank(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	
	public void add_branch(Bank b) {
		Bank.bankList.add(b);
		System.out.println(Bank.bankList);
	}
	
	
	public ArrayList<Bank> list_branches() {
		return Bank.bankList;
	}
	
	
	@Override
	public String toString() {
		return "Branch [name=" + name + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		Bank b = new Bank("BOI", "Baner");
		b.add_branch(b);
		
				
	}
	
}
