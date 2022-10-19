package com.tns.dao;

import com.tns.entity.Student;

public interface StudentDao {
	
	// Find Student
	public abstract Student getStudentById(int id);
	
	// Add Student
	public abstract void addStudent(Student student);
	
	
	//Delete Student
	public abstract void removeStudent(Student student);
	
	//Update Student
	public abstract void updateStudent(Student student);
	
	public abstract void commitTransection();
	public abstract void beginTransection();
	
	
}
