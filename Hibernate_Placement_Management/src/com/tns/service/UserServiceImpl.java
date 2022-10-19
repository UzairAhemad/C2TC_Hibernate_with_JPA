package com.tns.service;

import com.tns.dao.UserDao;
import com.tns.dao.UserDaoImpl;
import com.tns.entity.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public User findUserById(long UserId) {
		User user = dao.getUserById(UserId);
		return user;
	}

	@Override
	public void addUser(User user) {
		dao.beginTransection();
		dao.addUser(user);
		dao.commitTransection();
		
	}

	@Override
	public void updateUser(User user) {
		dao.beginTransection();
		dao.updateUser(user);
		dao.commitTransection();
		
	}

	@Override
	public void removeUser(User user) {
		dao.beginTransection();
		dao.removeUser(user);
		dao.commitTransection();
		
		
	}

}
