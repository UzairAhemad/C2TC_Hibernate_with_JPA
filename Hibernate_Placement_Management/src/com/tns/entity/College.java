package com.tns.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "college")

public class College implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CollegeId")
	private long collegeId;
	
	@Column(name = "CollegeName")
	private String collegeName;
		
	@Column(name = "CollegeLocation")
	private String location;
	
	@OneToOne(mappedBy = "studentCollege")
	private User user;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.PERSIST)
	private Set<Student> student;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.PERSIST)
	private Set<Placement> placement;
	
	@OneToMany(mappedBy = "college")
	private Set<Certificate> certificate;
	
	public College() {
		
	}
	
	public College(int collegeId, String collegeName, String location) {
		
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.location = location;
		
	}

	public long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Set<Placement> getPlacement() {
		return placement;
	}

	public void setPlacement(Set<Placement> placement) {
		this.placement = placement;
	}

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "college [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location + "]";
	}
		
}
