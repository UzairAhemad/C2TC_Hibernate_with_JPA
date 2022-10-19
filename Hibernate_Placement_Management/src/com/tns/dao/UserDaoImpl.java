package com.tns.dao;

import javax.persistence.EntityManager;				
import com.tns.entity.User;

public class UserDaoImpl implements UserDao{

	private EntityManager entityManager;
	public UserDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public User getUserById(long UserId) {
		User user = entityManager.find(User.class, UserId);
		return user;
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void removeUser(User user) {
		entityManager.remove(user);
		
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
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
