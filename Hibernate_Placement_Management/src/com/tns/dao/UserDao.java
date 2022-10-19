package com.tns.dao;

import com.tns.entity.User;

public interface UserDao {
	
		// Find Student
		public abstract User getUserById(long UserId);
				
		// Add Student
		public abstract void addUser(User user);
				
				
		//Delete Student
		public abstract void removeUser(User user);
				
		//Update Student
		public abstract void updateUser(User user);
				
		public abstract void commitTransection();
		public abstract void beginTransection();
}
