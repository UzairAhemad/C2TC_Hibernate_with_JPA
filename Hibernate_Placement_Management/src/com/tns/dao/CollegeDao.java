package com.tns.dao;

import com.tns.entity.College;

public interface CollegeDao {
	
		// Find Student
		public abstract College getCollegeById(long collegeId);
		
		// Add Student
		public abstract void addCollege(College college);
		
		
		//Delete Student
		public abstract void removeCollege(College college);
		
		//Update Student
		public abstract void updateCollege(College college);
		
		public abstract void commitTransection();
		public abstract void beginTransection();
}
