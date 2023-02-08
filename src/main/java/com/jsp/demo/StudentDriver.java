package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student s1 = new Student();
		s1.setId(7884);
		s1.setName("ramesh");
		s1.setEmail("ramesh@mail.com");
		entityTransaction.begin();
		entityManager.persist(s1);
		entityTransaction.commit();
		System.out.println("all good");
	}
}
