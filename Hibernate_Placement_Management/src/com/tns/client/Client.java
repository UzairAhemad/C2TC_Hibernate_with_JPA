									
							
										/******   java C2TC Program ( TNS & CG )  ( Batch M24 )   ******/

										 /******   PROJECT NAME :- PLACEMENT MANAGEMENT SYSTEM   ******/
														
													    /******   GROUP NO:- G4   ******/

													 /******   Name of the members   ******/
										
										/******   1) Uzair Ahemad Sayyed   ( UID - TC02022436 )   ******/
										/******   2) Mukesh Bhunjade	   ( UID - TC02022413 )   ******/
										/******   3) Nehal Vajpal          ( UID - TC02022415 )   ******/
										/******   4) Neha Sunil Gavali     ( UID - TC02022414 )   ******/
										/******   5) Shweta Sunil Ghogare  ( UID - TC02022434 )   ******/
										/******   6) Pooja Jambhulkar	   ( UID - TC02022416 )   ******/


package com.tns.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entity.Admin;
import com.tns.entity.Certificate;
import com.tns.entity.College;
import com.tns.entity.Placement;
import com.tns.entity.Student;
import com.tns.entity.User;
import com.tns.service.AdminService;
import com.tns.service.AdminServiceImpl;
import com.tns.service.CertificateService;
import com.tns.service.CertificateServiceImpl;
import com.tns.service.CollegeService;
import com.tns.service.CollegeServiceImpl;
import com.tns.service.PlacementService;
import com.tns.service.PlacementServiceImpl;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;
import com.tns.service.UserService;
import com.tns.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		StudentService ss = new StudentServiceImpl();
		AdminService as = new AdminServiceImpl();
		CollegeService cs =new CollegeServiceImpl();
		UserService us = new UserServiceImpl();
		CertificateService Cs= new CertificateServiceImpl();
		PlacementService ps = new PlacementServiceImpl();
		
		
		
										  /********************   FOR STUDENT   ********************/
		
		// Student 1
		Student student = new Student();
		student.setName("Uzair Ahemad");
		student.setRoll(12);
		student.setQualification("BE");
		student.setYear(2020);
		student.setHallTicketNo(5862);
		student.setCourse("Electrical");
		
		System.out.println("Row Inserted");
		
		// Student 2
		Student student1 = new Student();
		student1.setName("Mukesh Bhunjade");
		student1.setRoll(13);
		student1.setQualification("BE");
		student1.setYear(202);
		student1.setHallTicketNo(5850);
		student1.setCourse("CS");
		
		System.out.println("Row Inserted");
		
/*		// Retrieve Operation
		student = ss.findStudentById(1);
		System.out.println("ID"+student.getId());
		System.out.println(student);
		
		//Update Operation
		student = ss.findStudentById(2);
		student.setName("Neha");
		student.setQualification("B.com");
		ss.updateStudent(student);
		System.out.println("Row updated");
		System.out.println(student);
		
		
		//Delete Operation 
		student = ss.findStudentById(1);
		System.out.println(student);
		ss.removeStudent(student);
		System.out.println("Row deleted"); */
		

										  /********************  FOR ADMIN   ********************/
		
		// Admin 1
		Admin admin = new Admin();
		admin.setAdminId(1234);
		admin.setAdminName("Uzair Ahemad");
		admin.setAdminPassword("Uzair@123");
		as.addAdmin(admin);
				
		// Admin 2
		Admin admin1 = new Admin();
		admin1.setAdminId(1453);
		admin1.setAdminName("Nehal Vajpal");
		admin1.setAdminPassword("Nehal@563");
		as.addAdmin(admin1);
		
/*		// Retrieve Operation
		admin = as.findAdminById(1);
		System.out.println("ID"+admin.getAdminId());
		System.out.println(admin);
		
		//Update Operation 
	    admin = as.findAdminById(1234);
	     as.updateAdmin(admin);
	 	System.out.println("Row updated");
	     
	    //Delete Operation 
	    admin = as.findAdminById(1234);
		System.out.println(admin);
		as.removeAdmin(admin);
		System.out.println("Row deleted");	*/
		
		
										  /********************  FOR COLLEGE   ********************/
		
		// College 1 
	    College college = new College();	
		college.setCollegeId(343);
		college.setCollegeName("JIEMS");
		college.setLocation("Thane");
		cs.addCollege(college);
		
		
		// College 2
		College college1 = new College();	
		college1.setCollegeId(344);
		college1.setCollegeName("ACPCOI");
		college1.setLocation("Navi Mumbai");
		cs.addCollege(college1);
		
/*		// Update Operation
		college = cs.findCollegeById(343);
		college.setCollegeId(325);
		college.setCollegeName("NMU");
		cs.updateCollege(college);
		System.out.println("Row updated");
		System.out.println(college);
				
				
		// Delete Operation
		college = cs.findCollegeById(343);
		System.out.println(college);
		cs.removeCollege(college);
		System.out.println("Row deleted");	*/
		
		
										  /********************  FOR USER   ********************/
		
		//Row1
		User user = new User();
		user.setUserId(7898); 
		user.setUserName("MukeshBhunjade"); 
		user.setUserPassword("Mukesh@123"); 
		user.setUserType("student"); 
		us.addUser(user);
				
				
		//Row1
		User user1 = new User();
		user1.setUserId(7834); 
		user1.setUserName("Avantika Tiwari"); 
		user1.setUserPassword("Avantica@134"); 
		user1.setUserType("Teacher"); 
		us.addUser(user1);

		
										  /********************  FOR CERTIFICATE   ********************/
		
		// First Student Certificate 
		Certificate certificate = new Certificate();
		certificate.setCollege("BCOE");
		certificate.setPassingyear(2021);
		certificate.setStudentid(1);
		Cs.addCertificate(certificate);
				
		// Second Student Certificate
		Certificate certificate1 = new Certificate();
		certificate1.setCollege("ACPCOI");
		certificate1.setPassingyear(2020);
		certificate1.setStudentid(2);
		//Cs.addCertificate(certificate1);
		
		
										  /********************  FOR PLACEMENTS   ********************/
		
		// First Placement
		LocalDate date = LocalDate.of(2022, 5, 25);
		Placement  placement = new Placement() ;
		placement.setDate(date);
		placement.setName("Capgemini");
		placement.setPlacementid(243);
		placement.setQualification("B.E");
		placement.setYear(2021);
		ps.addPlacement(placement);			
				
		// Second Placement
		LocalDate date1 =LocalDate.of(2022, 6, 4);
		Placement  placement1 = new Placement() ;
		placement1.setDate(date1);
		placement1.setName("TCS");
		placement1.setPlacementid(223);
		placement1.setQualification("MCA");
		placement1.setYear(2020);
		ps.addPlacement(placement1);
		
		
										  /********************  MAPPING ONE TO ONE   ********************/
		
		// One to One student and certificate
	    student.setStudentCertificate(certificate);
		em.persist(student);
			
		student1.setStudentCertificate(certificate1);
		em.persist(student1);
			
			
		// One to One admin and user
		user.setStudentAdmin(admin);
		em.persist(user);
			
		user1.setStudentAdmin(admin1);
		em.persist(user1);
			
			
		// One to One college and user
		user.setStudentCollege(college);
		em.persist(user);
			
		user1.setStudentCollege(college1);
		em.persist(user1);
			
		System.out.println("One to One Mapping Succesfully Done...");
		

										  /********************  MAPPING ONE TO MANY   ********************/
		
		// Many To One Student and College
		student.setCollege(college);
		em.persist(student);
		
		student1.setCollege(college1);
		em.persist(student1);
		
		// Many To One Placement and College
		placement.setCollege(college);
		em.persist(placement);
		
		placement1.setCollege(college1);
		em.persist(placement1);
		
		// Many To One Certificate and College
		certificate.setCollege(college);
		em.persist(certificate);
		
		certificate1.setCollege(college1);
		em.persist(certificate1);
		
		System.out.println("One to Many Succesfully Done...");
		
		
		System.out.println("Tables Created Successfully...");
			
		em.getTransaction().commit();		
		em.close();
		factory.close();
		
		
		
	}

}
