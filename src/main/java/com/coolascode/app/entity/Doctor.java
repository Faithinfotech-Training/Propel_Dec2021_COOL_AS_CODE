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
@Table(name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private int doctorId;

	@Column(name="staff_id",nullable=false)
	private int staffId;

	@OneToOne
	@JoinColumn(name="staff_id", insertable=false,updatable=false)
	private Staff staff;

	@Column(name="department_id")
	private int departmentId;	

	@ManyToOne
	@JoinColumn(name="department_id", insertable=false,updatable=false)
	private Department department;


	@Column(name="specialization_id",nullable=false)
	private int specializationId;

	@OneToOne
	@JoinColumn(name="specialization_id", insertable=false,updatable=false)
	private Specialization specialization;
	
	@Column(name="consultation_fees",precision=10, scale=2)
	private double consultationFees;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, int staffId, Staff staff, int departmentId, Department department, int specializationId,
			Specialization specialization, double consultationFees) {
		super();
		this.doctorId = doctorId;
		this.staffId = staffId;
		this.staff = staff;
		this.departmentId = departmentId;
		this.department = department;
		this.specializationId = specializationId;
		this.specialization = specialization;
		this.consultationFees = consultationFees;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public double getConsultationFees() {
		return consultationFees;
	}

	public void setConsultationFees(double consultationFees) {
		this.consultationFees = consultationFees;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", staffId=" + staffId + ", staff=" + staff + ", departmentId="
				+ departmentId + ", department=" + department + ", specializationId=" + specializationId
				+ ", specialization=" + specialization + ", consultationFees=" + consultationFees + "]";
	}

	
	
}
