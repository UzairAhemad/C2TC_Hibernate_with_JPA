package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private EntityManager entityManager;
	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);		
	}

	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
		
	}

	@Override
	public void commitTransection() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransection() {
		entityManager.getTransaction().begin();
	}

}
