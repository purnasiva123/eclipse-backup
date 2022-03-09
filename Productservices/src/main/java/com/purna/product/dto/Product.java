package com.purna.product.dto;

public class Product {
	private int Id;
	private String Name;
	private String Description;
	private int Price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
 
}
