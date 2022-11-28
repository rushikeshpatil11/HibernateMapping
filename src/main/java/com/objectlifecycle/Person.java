package com.objectlifecycle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int srno;
	private String name;
	private String gender;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int srno, String name, String gender) {
		super();
		this.srno = srno;
		this.name = name;
		this.gender = gender;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [srno=" + srno + ", name=" + name + ", gender=" + gender + "]";
	}
	

}
