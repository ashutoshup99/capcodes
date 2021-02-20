package com.cap.repost;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.Test;

import com.cap.pra.Address;
import com.cap.pra.Person;

public class AddressRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	public void addAddress(Address a) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(a);
		tx.commit();
	}
	public void deleteAddress(int id) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address ep=em.find(Address.class, id);
		em.remove(ep);
		tx.commit();
	}
	public void findaddr(int id) {
		Address a=em.find(Address.class,id);
		System.out.println(a);
	}
	public List<Address> findAllAddress(){
		TypedQuery<Address> query=em.createQuery("select c from Address c ",Address.class);
		return query.getResultList();
		
	}
	public void upadateAddress(int id,Address a) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Person p=em.find(Person.class, id);
		p.setAddress(a);
		tx.commit();
	}
	public void upadateAddressCity(int id,String a) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address a1=em.find(Address.class, id);
		a1.setCity(a);
		tx.commit();
	}
	public void upadateHouseNumber(int id,int a) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address a1=em.find(Address.class, id);
		a1.setHouseNumber(678);
		tx.commit();
	}
	public void upadateAddressLocation(int id,String a) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address a1=em.find(Address.class, id);
		a1.setLocation(a);
		tx.commit();
	}


}
