package com.tns.dao;

import javax.persistence.EntityManager;
import com.tns.entity.Admin;

public class AdminDaoImpl implements AdminDao{
	
	private EntityManager entityManager;
	public AdminDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Admin getAdminById(long AdminId) {
		Admin admin = entityManager.find(Admin.class, AdminId);
		return admin;
	}

	@Override
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);
		
	}

	@Override
	public void removeAdmin(Admin admin) {
		entityManager.remove(admin);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);
		
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
