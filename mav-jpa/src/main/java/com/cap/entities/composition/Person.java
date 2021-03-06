package com.cap.entities.composition;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	double salary;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Vehicle> vehicles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Person(String name, double salary, List<Vehicle> vehicles) {
		super();
		this.name = name;
		this.salary = salary;
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", salary=" + salary + ", vehicles=" + vehicles + "]";
	}
	
}
