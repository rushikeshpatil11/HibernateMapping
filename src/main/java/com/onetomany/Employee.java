package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Employee {
	@Id
	private int empid;
	private String empnm;
	@OneToMany
	private List<Address> list;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empnm, List<Address> list) {
		super();
		this.empid = empid;
		this.empnm = empnm;
		this.list = list;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpnm() {
		return empnm;
	}
	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empnm=" + empnm + ", list=" + list + "]";
	}
	
	

}
