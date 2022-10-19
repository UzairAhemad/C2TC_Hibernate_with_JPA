package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entity.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}
	
	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransection();
		dao.addStudent(student);
		dao.commitTransection();
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransection();
		dao.updateStudent(student);
		dao.commitTransection();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransection();
		dao.removeStudent(student);
		dao.commitTransection();
		
	}

}
