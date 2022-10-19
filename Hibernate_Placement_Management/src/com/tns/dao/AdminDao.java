package com.tns.dao;

import com.tns.entity.Admin;

public interface AdminDao {

		// Find Student
		public abstract Admin getAdminById(long AdminId);
						
		// Add Student
		public abstract void addAdmin(Admin admin);
						
						
		//Delete Student
		public abstract void removeAdmin(Admin admin);
						
		//Update Student
		public abstract void updateAdmin(Admin admin);
		
		public abstract void commitTransection();
		public abstract void beginTransection();
}
