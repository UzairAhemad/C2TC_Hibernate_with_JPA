package com.tns.dao;

import com.tns.entity.Student;

public interface StudentDao {
	
			// Find 
			public abstract Student getStudentById(int id);
			// Insert
			public abstract void addStudent(Student student);
			//Delete
			public abstract void removeStudent(Student student);
			// Update
			public abstract void updateStudent(Student student);
			
			public abstract void commetTransection();
			public abstract void beginTransection();
}
