package com.cap.pwt.repos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.pwt.entities.Userg;

public class UserRepository {
	/* Create EntityManagerFactory */
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
	
	
	
	public void addUser(Userg e) {
		//User password validation logic
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		// Managed State
		
		tx.commit();
		// Detached state
		e.setPassword("admin");
		
	}
	public Userg findUser(String email) {
		TypedQuery<Userg> query = em.createQuery("select u from Userg u where u.email=:email", Userg.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}
	
	public Userg findUser(int id) {
		// starting a transactions
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Userg user = em.find(Userg.class, id);
		user.setPassword("test");
		
		// commit transaction
		tx.commit();
		em.close();
		// Detached state
		
		return user;
	}


	// MIN, MAX, SUM, OR
	public Userg findUserByEmail(String email){
		TypedQuery<Userg> query = em.createQuery("SELECT u FROM User u where u.email = :x AND u.password = :y", Userg.class);
		query.setParameter("x",email);
		query.setParameter("y","test");
		Userg user = query.getSingleResult();
		return user;
	}
	
	
}
