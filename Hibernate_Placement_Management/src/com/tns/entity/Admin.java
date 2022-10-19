package com.tns.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Admin")

public class Admin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "AdminId")
	private long adminId;
	
	@Column(name = "Adminname")
	private String adminName;
	
	@Column(name = "AdminPassword")
	private String adminPassword;
	
	@OneToOne(mappedBy = "studentAdmin")
	private User user;
	
	public Admin() {
		
	}

	public Admin(long adminId, String adminName, String addminPassword) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}
		
}
