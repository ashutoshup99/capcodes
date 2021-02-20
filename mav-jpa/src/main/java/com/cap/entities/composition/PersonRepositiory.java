package com.cap.entities.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PersonRepositiory {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	
//	public List<Employee> findAllEmployees(){
//		
//		em.find(Employee.class, 3);
//		// select queries
//	}
	
	//CRUD - Create, Read, Update, Delete
	//Named Queries - HQL
	
	public Person findPerson(int id) {
		return em.find(Person.class, id);
	}
	
	public void addPerson(Person e) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
	}
	
	public void deletePerson(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Person ef = em.find(Person.class, id);
		em.remove(ef);
		tx.commit();
	}
	
	
	public void updatePerson(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Person ef = em.find(Person.class, id);
		ef.setName("Amit");
		tx.commit();
	}
	
	public List<Person> findAllPerson(){
		TypedQuery<Person> query = em.createQuery("select e from Employee e where e.salary > :x", Person.class);
		query.setParameter("x", 40000.0);
		List<Person> persons = query.getResultList();
		return persons;
	}
	
	public static void main(String[] args) {
		PersonRepositiory repo = new PersonRepositiory();
		Vehicle v1 = new Vehicle("BMW","Duke");
		Vehicle v2 = new Vehicle("Benz","Fz");
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(v1);
		vehicles.add(v2);
		
		Person e = new Person("Ravi", 43433.34, vehicles);
		repo.addPerson(e);
		
//		Employee foundEmployee = repo.findEmployee(1);
//		System.out.println(foundEmployee);
		
//		
//		List<Employee> employees = repo.findAllEmployees();
//		System.out.println(employees);
	}

}
