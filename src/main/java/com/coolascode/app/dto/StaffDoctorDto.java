package com.coolascode.app.dto;

import java.util.Date;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import org.springframework.stereotype.Repository;

/*
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
		    name = "savedoctorstaff", 
		    procedureName = "save_doctorstaff", 
		    parameters = { 
		        @StoredProcedureParameter(mode = ParameterMode.IN, name = "staffId", type = Integer.class), 
		        @StoredProcedureParameter(mode = ParameterMode.IN,  name = "staffNo",type = String.class), 
		        @StoredProcedureParameter( mode = ParameterMode.IN,name = "staffName", type = String.class)
		    }
		)
	})*/
public class StaffDoctorDto {

	
	private int staffId;
	private String staffNo;
	private String staffName;
	private String mobile;
	private String email;
	private int genderId;
	private int genderName;
	private String address;	
	private int education;
	private int educationName;
	private Date dob;
	private Date dateOfJoining;
	private Date createdDate;
	private Date modifiedDate;
	private boolean isActive;
	

	private int userId;
	private String userName;
	private String password;
	private int roleId;	
	private int roleName;	
	

	private int doctorId;
	private int departmentId;
	private int departmentName;	
	private int specializationId;
	private int specializationName;
	private double consultationFees;
	public StaffDoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffDoctorDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			int genderName, String address, int education, int educationName, Date dob, Date dateOfJoining,
			Date createdDate, Date modifiedDate, boolean isActive, int userId, String userName, String password,
			int roleId, int roleName, int doctorId, int departmentId, int departmentName, int specializationId,
			int specializationName, double consultationFees) {
		super();
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.mobile = mobile;
		this.email = email;
		this.genderId = genderId;
		this.genderName = genderName;
		this.address = address;
		this.education = education;
		this.educationName = educationName;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
		this.roleName = roleName;
		this.doctorId = doctorId;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.specializationId = specializationId;
		this.specializationName = specializationName;
		this.consultationFees = consultationFees;
	}
	public StaffDoctorDto(int staffId, String staffNo, String staffName, String mobile, String email, int genderId,
			String address, int education, Date dob, Date dateOfJoining, Date createdDate, Date modifiedDate,
			boolean isActive, String userName, String password, int roleId, int departmentId, int specializationId,
			double consultationFees) {
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
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
		this.departmentId = departmentId;
		this.specializationId = specializationId;
		this.consultationFees = consultationFees;
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
	public int getGenderName() {
		return genderName;
	}
	public void setGenderName(int genderName) {
		this.genderName = genderName;
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
	public int getEducationName() {
		return educationName;
	}
	public void setEducationName(int educationName) {
		this.educationName = educationName;
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
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getRoleName() {
		return roleName;
	}
	public void setRoleName(int roleName) {
		this.roleName = roleName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(int departmentName) {
		this.departmentName = departmentName;
	}
	public int getSpecializationId() {
		return specializationId;
	}
	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}
	public int getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(int specializationName) {
		this.specializationName = specializationName;
	}
	public double getConsultationFees() {
		return consultationFees;
	}
	public void setConsultationFees(double consultationFees) {
		this.consultationFees = consultationFees;
	}
	
	
	
}
