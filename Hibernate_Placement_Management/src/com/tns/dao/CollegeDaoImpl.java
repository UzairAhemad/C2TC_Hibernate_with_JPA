package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entity.College;

public class CollegeDaoImpl implements CollegeDao {
	
	private EntityManager entityManager;
	public CollegeDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public College getCollegeById(long collegeId) {
		College college = entityManager.find(College.class, collegeId);
		return college;
	}
	
	@Override
	public void addCollege(College college) {
		entityManager.persist(college);
		
	}
	
	@Override
	public void removeCollege(College college) {
		entityManager.remove(college);
		
	}
	
	@Override
	public void updateCollege(College college) {
		entityManager.merge(college);
		
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
