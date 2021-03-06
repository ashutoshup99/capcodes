package com.cap.entities.composition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String car;
	String bike;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	public Vehicle() {
		
	}
	public Vehicle(String car, String bike) {
		super();
		this.car = car;
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", car=" + car + ", bike=" + bike + "]";
	}
	
}
