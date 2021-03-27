package com.crud.main.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.crud.main.entity.Author;

public class Book {
	
	private String id;
	private String name;
	private String price;
	private String currency;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
