package com.crud.main.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.crud.main.model.Book;


@Entity
public class Author {
@Id
	private String id;
	private String email;
	private String firstName;
	private String lirstName;
	private String userName;
	private Contact contact;
	@OneToMany(cascade = CascadeType.ALL)
	private Book book;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLirstName() {
		return lirstName;
	}
	public void setLirstName(String lirstName) {
		this.lirstName = lirstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
	
	
	
	
}
