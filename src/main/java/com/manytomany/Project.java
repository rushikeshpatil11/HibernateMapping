package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	
	@Id
	private int p_id;
	private String p_name;
	@ManyToMany(mappedBy = "projects")
	private List<EmployeeTCS> employees;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int p_id, String p_name, List<EmployeeTCS> employees) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.employees = employees;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<EmployeeTCS> getEmployees() {
		return employees;
	}
	public void setEmployees(List<EmployeeTCS> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [p_id=" + p_id + ", p_name=" + p_name + ", employees=" + employees + "]";
	}
	
}
