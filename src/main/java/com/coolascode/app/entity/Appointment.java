package com.coolascode.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="appointment")
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="patient_id")
	private int patientId;
	
	@ManyToOne
	@JoinColumn(name="patient_id", insertable=false,updatable=false)
	private Patient patient;
	
	@Column(name="department_id")
	private int departmentId;
	
	@ManyToOne
	@JoinColumn(name="department_id", insertable=false,updatable=false)
	private Department department;
	
	
	@Column(name="doctor_id")
	private int doctorId;

	@ManyToOne
	@JoinColumn(name="doctor_id", insertable=false,updatable=false)
	private Doctor doctor;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Column(name="token_no")
	private String tokenNo;
	

	@Column(name="status", columnDefinition = "TINYINT", length = 1)
	private boolean status;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}