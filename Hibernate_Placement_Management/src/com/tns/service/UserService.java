package com.tns.service;

import com.tns.entity.User;

public interface UserService {
	
		public abstract User findUserById(long UserId);
		public abstract void addUser(User user);
		public abstract void updateUser(User user);
		public abstract void removeUser(User user);
}
