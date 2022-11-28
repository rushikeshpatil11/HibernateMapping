package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int adharno;
	private int age;
	private String name;
	private String gender;
	@OneToOne
	private PFAccount pfaccount;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAdharno() {
		return adharno;
	}

	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}

	public Person(int adharno, int age, String name, String gender, PFAccount pfaccount) {
		super();
		this.adharno = adharno;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.pfaccount = pfaccount;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public PFAccount getPfaccount() {
		return pfaccount;
	}
	public void setPfaccount(PFAccount pfaccount) {
		this.pfaccount = pfaccount;
	}

	@Override
	public String toString() {
		return "Person [adharno=" + adharno + ", age=" + age + ", name=" + name + ", gender=" + gender + ", pfaccount="
				+ pfaccount + "]";
	}
	
	
	

}
