package com.coolascode.app.entity;

import java.util.Date;

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
@Table(name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="staff_id")
	private int staffId;

	@Column(name="staff_no",nullable=false,length=50)
	private String staffNo;
	
	@Column(name="staff_name",nullable=false,length=50)
	private String staffName;
	
	@Column(name="mobile",nullable=false,length=10)
	private String mobile;

	@Column(name="email",nullable=false,length=50)
	private String email;
	
	@Column(name="gender_id")
	private int genderId;
	@ManyToOne
	@JoinColumn(name="gender_id", insertable=false,updatable=false)
	private Gender gender;

	@Column(name="address",nullable=false,length=200)
	private String address;	

	@Column(name="education")
	private int education;

	@Column(name="dob")
	private Date dob;

	@Column(name="dateOfJoining")
	private Date dateOfJoining;

	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="is_active",nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean isActive;
	
	@OneToOne(mappedBy = "staff")
	private User user;
	

	@OneToOne(mappedBy = "staff")
	private Doctor doctor;


	public Staff() {
		
	}


	public Staff(int staffId, String staffNo, String staffName, String mobile, String email, int genderId, String address,
			int education, Date dob, Date dateOfJoining, Date createdDate, Date modifiedDate, boolean isActive,
			User user, Doctor doctor) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.address = address;
		this.education = education;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
		this.user = user;
		this.doctor = doctor;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getStaffNo() {
		return staffNo;
	}


	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getGenderId() {
		return genderId;
	}


	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getEducation() {
		return education;
	}


	public void setEducation(int education) {
		this.education = education;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffNo=" + staffNo + ", staffName=" + staffName + ", mobile=" + mobile
				+ ", email=" + email + ", genderId=" + genderId + ", address=" + address + ", education=" + education
				+ ", dob=" + dob + ", dateOfJoining=" + dateOfJoining + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", isActive=" + isActive + ", user=" + user + "]";
	}
	
	
}
