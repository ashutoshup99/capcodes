package com.cap.pwt.repos;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.pwt.entities.Category;

import javax.persistence.EntityTransaction;

public class CategoryRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	public void addCategory(Category category) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(category);
		tx.commit();
	}
	
	public Category findCategoryByName(String categoryName) {	
		TypedQuery<Category> query = em.createQuery("select c from Category c where c.name=:name", Category.class);
		query.setParameter("name", categoryName);
		return query.getSingleResult();
	}

	public void deleteCategory(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);
		em.remove(c);

		tx.commit();
		
	}
	public void editCategory(int id,String n) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Category c=em.find(Category.class,id);
		c.setName(n);
		tx.commit();
	}
	
	public void updateCategory(int i, String name) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);
		c.setName(name);

		tx.commit();
		
	}
	
	public Category findCategory(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);

		tx.commit();
		return c;
		
	}
	public List<Category> findAllCategory() {
		TypedQuery<Category> query = em.createQuery("select c from Category c ", Category.class);
		return query.getResultList();
	}
}
