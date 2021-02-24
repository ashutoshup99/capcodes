package com.cap.userspwejp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Userg {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String email;
	String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Userg() {
		
	}
	public Userg(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
}
