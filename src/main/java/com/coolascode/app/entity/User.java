package com.coolascode.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Column(name="user_name",nullable=false,length=20)
	private String userName;
	
	@Column(name="password",nullable=false,length=20)
	private String password;

	@Column(name="role_id")
	private int roleId;	

	@ManyToOne
	@JoinColumn(name="role_id", insertable=false,updatable=false)
	private Role role;
	

	@Column(name="staff_id")
	private int staffId;

	@OneToOne
	@JoinColumn(name="staff_id", insertable=false,updatable=false)
	private Staff staff;

	@Column(name="is_active", columnDefinition = "TINYINT", length = 1)
	private boolean isActive;

	public User() {
		super();
	}

	public User(int userId, String userName, String password, boolean isActive, int roleId, Role role, int staffId,
			Staff staff) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isActive = isActive;
		this.roleId = roleId;
		this.role = role;
		this.staffId = staffId;
		this.staff = staff;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", isActive=" + isActive
				+ ", roleId=" + roleId + ", role=" + role + ", staffId=" + staffId + ", staff=" + staff + "]";
	}
	
	
	
}
