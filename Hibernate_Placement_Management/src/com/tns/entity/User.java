package com.tns.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UserId")
	private long userId;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "UserType")
	private String userType;
	
	@Column(name = "UserPassword")
	private String userPassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "College_id")
	private College studentCollege;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "Admin_Id")
		private Admin studentAdmin;
		
	public User() {
		
	}
	
	public User(long userId, String userName, String userType, String userPassword, Admin studentAdmin, College studentCollege) {
		
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userPassword = userPassword;
		
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public College getStudentCollege() {
		return studentCollege;
	}

	public void setStudentCollege(College studentCollege) {
		this.studentCollege = studentCollege;
	}

	public Admin getStudentAdmin() {
		return studentAdmin;
	}

	public void setStudentAdmin(Admin studentAdmin) {
		this.studentAdmin = studentAdmin;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userPassword="
				+ userPassword + "]";
	}
	
}
