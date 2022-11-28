package com.hqlquery;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private int accno;
	private String name;
	private String branch;
	private String city;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int accno, String name, String branch, String city) {
		super();
		this.accno = accno;
		this.name = name;
		this.branch = branch;
		this.city = city;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", branch=" + branch + ", city=" + city + "]";
	}
	
	
}
