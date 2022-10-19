package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImpl;
import com.tns.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student stument) {
			dao.beginTransection();
			dao.addStudent(stument);
			dao.commetTransection();
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransection();
		dao.updateStudent(student);
		dao.commetTransection();
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransection();
		dao.removeStudent(student);
		dao.commetTransection();
	}

	@Override
	public Student findStudentById(int id) {
		Student stument = dao.getStudentById(id);
		return stument;
	}
}
