package com.cap.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserRepository {
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	public void register(Useremp u) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(u);
		tx.commit();
	}
	//CRUD - Create, Read, Update, Delete
		//Named Queries - HQL
		
		public Useremp findUser(int id) {
			return em.find(Useremp.class, id);
		}
		
		public void addUser(Employee e) {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(e);
			tx.commit();
		}
		
		public void deleteUser(int id) {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			Useremp ef = em.find(Useremp.class, id);
			em.remove(ef);
			tx.commit();
		}
		
		
		public void updateUser(int id) {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			Useremp ef = em.find(Useremp.class, id);
//			ef.setName("Amit");
			ef.setEmail("newemail@gmail.com");
			tx.commit();
		}
		
		public List<Useremp> findallUser(){
			TypedQuery<Useremp> query = em.createQuery("select e from Useremp e", Useremp.class);
//			query.setParameter("x", "johnathon@test.com");
			List<Useremp> use = query.getResultList();
			return use;
		}
	public static void main(String[] args) {
		UserRepository ur= new UserRepository();
//		Useremp u = new Useremp("hetset@test.com", "hellotest");
//		Useremp u1 = new Useremp("johnathon@test.com", "passishere");
//		Useremp u2 = new Useremp("johnwick@test.com", "iamback");
//		ur.register(u);
//		ur.register(u1);
//		ur.register(u2);
//		ur.deleteUser(1);
//		ur.updateUser(2);
//		List<Useremp> l=ur.findallUser();
//		System.out.println(l);
		
	}

}