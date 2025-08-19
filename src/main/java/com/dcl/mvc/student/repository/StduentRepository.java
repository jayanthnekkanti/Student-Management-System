package com.dcl.mvc.student.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcl.mvc.student.entity.Student;

@Repository
public class StduentRepository {

	@Autowired
	private EntityManagerFactory emf;

	public void saveStudent(Student student) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(student);
		
		et.commit();
		em.close();
		
	}

	public List<Student> fetchStudent(Student student) {
		
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("FROM Student s");
	
		List<Student> student1 = query.getResultList();
		
		return student1;
	}

	public Student mergStudent(int id) {
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		 Student student =  em.find(Student.class, id)	;
		 em.close();
		return student;
	}

	public void mergeStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(student);
		et.commit();
		em.close();
		
	}

	public void deleteStudent(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("DELETE Student s WHERE s.id=?1");
		query.setParameter(1, id);
		
		query.executeUpdate();
		et.commit();
		em.close();
		
	}

	public Student findById(int studentId) {
		EntityManager em = emf.createEntityManager();
		Student student = em.find(Student.class, studentId);
		em.close();
		return student;
	}

	
}
