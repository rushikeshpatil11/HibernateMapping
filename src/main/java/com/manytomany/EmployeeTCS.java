package com.manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class EmployeeTCS {
	@Id
	private int e_id;
	private String e_name;
	@ManyToMany
	private List<Project> projects;
	public EmployeeTCS() {
		super();
	}
	public EmployeeTCS(int e_id, String e_name, List<Project> projects) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.projects = projects;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "EmployeeTCS [e_id=" + e_id + ", e_name=" + e_name + ", projects=" + projects + "]";
	}
}
