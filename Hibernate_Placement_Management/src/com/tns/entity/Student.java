package com.tns.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.tns.service.CertificateService;

@Entity
@Table(name = "Student")

public class Student implements Serializable {

	// Serial Version id
	private static final long serialVersionUID = 1L; 
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "Id")
	    private int id;
		
		
		@Column(name = "Name")
		private String name;
		
		@Column(name = "Roll")
		private long roll;
		
		@Column(name = "Qualification")
		private String qualification;
		
		@Column(name = "Year")
		private int year;
		
		@Column(name = "Course")
		private String course;
		
		@Column(name = "HallTicketNo")
		private long hallTicketNo;
		
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "Certificate_Id")
		private Certificate studentCertificate;
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "College_Id")
		private College college;
		
		public Student() {
			
		}
		
		
		public Student(int id, String name, long roll, String qualification, int year, String course, long hallTicketNo, Certificate studentCertificate) {
			
			this.id = id;
			this.name = name;
			this.roll = roll;
			this.qualification = qualification;
			this.year = year;
			this.course = course;
			this.hallTicketNo = hallTicketNo;
			this.studentCertificate = studentCertificate;
		}


		public long getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public long getRoll() {
			return roll;
		}


		public void setRoll(long roll) {
			this.roll = roll;
		}


		public String getQualification() {
			return qualification;
		}


		public void setQualification(String qualification) {
			this.qualification = qualification;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public String getCourse() {
			return course;
		}


		public void setCourse(String course) {
			this.course = course;
		}


		public long getHallTicketNo() {
			return hallTicketNo;
		}


		public void setHallTicketNo(long hallTicketNo) {
			this.hallTicketNo = hallTicketNo;
		}


		public Certificate getStudentCertificate() {
			return studentCertificate;
		}


		public void setStudentCertificate(Certificate studentCertificate) {
			this.studentCertificate = studentCertificate;
		}
		
		public College getCollege() {
			return college;
		}


		public void setCollege(College college) {
			this.college = college;
		}


	@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
					+ ", year=" + year + ", course=" + course + ", hallTicketNo=" + hallTicketNo + ", studentCertificate="
					+ studentCertificate + "]";
		}
	
}