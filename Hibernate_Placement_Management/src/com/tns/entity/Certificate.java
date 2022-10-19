package com.tns.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "certificate")
public class Certificate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "studentId")
	private int studentid;
	
	@Column(name = "passingYear")
	private int passingyear;
	
	@Column(name = "studentCollege")
	private String stdcollege;
	
	@OneToOne(mappedBy = "studentCertificate")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "College_Id")
	private College college;
	
	public Certificate() {
		
	}
	
	public Certificate(int studentid, int passingyear, String stdcollege) {
		
//		super();
		this.studentid = studentid;
		this.passingyear = passingyear;
		this.stdcollege = stdcollege;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public String getStdcollege() {
		return stdcollege;
	}

	public void setStdcollege(String stdcollege) {
		this.stdcollege = stdcollege;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	public void setCollege(String college) {
		this.stdcollege = college;
	}

	@Override
	public String toString() {
		return "Certificate [studentid=" + studentid + ", passingyear=" + passingyear + ", stdcollege=" + stdcollege
				+ ", student=" + student + "]";
	}
		
}
