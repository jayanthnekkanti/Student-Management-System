package com.dcl.mvc.student.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcl.mvc.student.entity.ProfileUrl;

@Repository
public class ProfileUrlRepository {

	@Autowired
	private EntityManagerFactory emf;
	public void saveProfile(ProfileUrl profileUrl) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(profileUrl);
		et.commit();
		em.close();
		
		
	}

}
