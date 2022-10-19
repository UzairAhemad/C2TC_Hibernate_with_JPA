package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {


		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
//		// Add Student
//		student.setStudentid(104);
//		student.setName("Naman");
//		service.addStudent(student);
		
//		// Retrieve Operation
//		student = service.findStudentById(102);
//		System.out.println("ID is: " + student.getStudentid());
//		System.out.println("Name is: " + student.getName());
		
//		//Update Operation
//		student  =service.findStudentById(103);
//		student.setName("Sunil");
//		service.updateStudent(student);
		
		// Delete Operation
		student = service.findStudentById(104);
		service.removeStudent(student);
		System.out.println("Row removed");
		
		
		
		
		
		
		System.out.println("End of program - life cycle completed...");

	}

}
