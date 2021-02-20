package com.cap.repost;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.pra.Person;

public class PersonRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapdbjpa");

	EntityManager em = emf.createEntityManager();
	public void findPer(int id) {
		Person p=em.find(Person.class, id);
		System.out.println(p);
	}
	public Person findperByName(String namee) {
		TypedQuery<Person> query=em.createQuery("select c from Person c where c.name=:name",Person.class);
		query.setParameter("name", namee);
		return query.getSingleResult();
	}
	public void addPerson(Person p) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(p);
		tx.commit();
	}
	public void deletePerson(int id) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Person ep=em.find(Person.class, id);
		em.remove(ep);
		tx.commit();
	}
	
	public void upadateName(int id,String s) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Person p=em.find(Person.class, id);
		p.setName(s);
		tx.commit();
	}
	public List<Person> findAllPerson(){
		TypedQuery<Person> query=em.createQuery("select c from Person c ",Person.class);
		return query.getResultList();
		
	}
	

}
