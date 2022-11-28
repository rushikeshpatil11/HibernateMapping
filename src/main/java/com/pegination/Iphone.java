package com.pegination;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Iphone {
	@Id
	private String appleid;
	private String model;
	private String color;
	private int price;
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Iphone(String appleid, String model, String color, int price) {
		super();
		
		this.appleid = appleid+"@apple.com";
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getAppleid() {
		return appleid;
	}
	public void setAppleid(String appleid) {
		this.appleid = appleid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Iphone [appleid=" + appleid + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	

}
