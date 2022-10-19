package com.tns.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Placement")
public class Placement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "placementId")
	private long placementid;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "Year")
	private int year;
	
	@Column(name = "date")
	private LocalDate date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "College_Id")
	private College college;
	
	public Placement() {
		
	}
	
	public Placement(long placementId, String name, String qualification, int year, LocalDate date ) {
		
		this.placementid = placementid;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
		this.date = date;
		
	}

	public long getPlacementid() {
		return placementid;
	}

	public void setPlacementid(long placementid) {
		this.placementid = placementid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Placement [placementid=" + placementid + ", name=" + name + ", qualification=" + qualification
				+ ", year=" + year + ", date=" + date + "]";
	}
	
}
