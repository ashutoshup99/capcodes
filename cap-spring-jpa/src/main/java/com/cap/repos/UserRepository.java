package com.cap.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cap.entities.Userg;
@Repository	
public class UserRepository {
	@PersistenceContext
	EntityManager em;
	
	public Userg findUser(String email) {
		TypedQuery<Userg> query = em.createQuery("select u from Userg u where u.email=:email", Userg.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}
	
	@Transactional
	public void addUser(Userg user) {
		em.persist(user);
	}

	@Transactional
	public void updateUserPassword(int id, String newPassword) {
		Userg user = em.find(Userg.class, id);
//		em.merge(user);
		user.setPassword(newPassword);
	
		
	}
}
