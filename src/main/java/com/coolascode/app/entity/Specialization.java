package com.coolascode.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="specialization")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="specialization_id")
	private int specializationId;

	@Column(name="specialization_name",nullable=false,length=50)
	private String specializationName;

	@Column(name="department_id")
	private int departmentId;	

	@ManyToOne
	@JoinColumn(name="department_id", insertable=false,updatable=false)
	private Department department;

	public Specialization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialization(int specializationId, String specializationName, int departmentId, Department department) {
		super();
		this.specializationId = specializationId;
		this.specializationName = specializationName;
		this.departmentId = departmentId;
		this.department = department;
	}

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
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

	@Override
	public String toString() {
		return "Specialization [specializationId=" + specializationId + ", specializationName=" + specializationName
				+ ", departmentId=" + departmentId + ", department=" + department + "]";
	}
	
	
	
}
