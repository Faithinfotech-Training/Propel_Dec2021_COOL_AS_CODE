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
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="staff_id")
	private int staffId;
	
	@OneToOne
	@JoinColumn(name="staff_id", insertable=false,updatable=false)
	private Staff staff;
	
	@Column(name="patient_name",nullable=false,length=50)
	private String patientName;
	
	@Column(name="patient_no",nullable=false,length=50)
	private String patientNo;
	
	@Column(name="mobile",nullable=false,length=10)
	private String mobile;

	@Column(name="email",nullable=false,length=50)
	private String email;
	
	@Column(name="gender_id")
	private int genderId;
	
	@ManyToOne
	@JoinColumn(name="gender_id", insertable=false,updatable=false)
	private Gender gender;
	
	@Column(name="blood_group_id")
	private int bloodGroupId;

	@ManyToOne
	@JoinColumn(name="blood_group_id", insertable=false,updatable=false)
	private BloodGroup bloodGroup;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="address",nullable=false,length=200)
	private String address;	
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;
	
	@Column(name="is_active",nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean isActive;
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, int staffId, Staff staff, String patientName, String patientNo, String mobile,
			String email, int genderId, Gender gender, int bloodGroupId, BloodGroup bloodGroup, Date dob, String address,
			Date createdDate, Date modifiedDate, boolean isActive, Appointment appointment) {
		super();
		this.patientId = patientId;
		this.staffId = staffId;
		this.staff = staff;
		this.patientName = patientName;
		this.patientNo = patientNo;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.gender = gender;
		this.bloodGroupId = bloodGroupId;
		this.bloodGroup = bloodGroup;
		this.dob = dob;
		this.address = address;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getBloodGroupId() {
		return bloodGroupId;
	}

	public void setBloodGroupId(int bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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


		

}