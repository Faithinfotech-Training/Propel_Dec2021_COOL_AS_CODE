package com.coolascode.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="prescription")
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="prescription_id")
	private int prescriptionId;
	
	
	@Column(name="appointment_id")
	private int appointmentId;
	
	@OneToOne
	@JoinColumn(name="appointment_id", insertable=false,updatable=false)
	private Appointment appointment;
	
	@Column(name="diagnosis",nullable=false,length=200)
	private String diagnosis;
	
	@OneToMany(mappedBy="prescription")
	private List<MedicinePrescription> medicineprescription;
	
	@OneToMany(mappedBy="prescription")
	private List<TestPrescription> testprescription;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	
	
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prescription(int prescriptionId, int appointmentId, Appointment appointment, String diagnosis,
			List<MedicinePrescription> medicineprescription, List<TestPrescription> testprescription, Date createdDate,
			Date modifiedDate) {
		super();
		this.prescriptionId = prescriptionId;
		this.appointmentId = appointmentId;
		this.appointment = appointment;
		this.diagnosis = diagnosis;
		this.medicineprescription = medicineprescription;
		this.testprescription = testprescription;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}



	public int getPrescriptionId() {
		return prescriptionId;
	}



	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}



	public int getAppointmentId() {
		return appointmentId;
	}



	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}



	public Appointment getAppointment() {
		return appointment;
	}



	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}



	public String getDiagnosis() {
		return diagnosis;
	}



	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	@JsonManagedReference
	public List<MedicinePrescription> getMedicineprescription() {
		return medicineprescription;
	}



	public void setMedicineprescription(List<MedicinePrescription> medicineprescription) {
		this.medicineprescription = medicineprescription;
	}



	public List<TestPrescription> getTestprescription() {
		return testprescription;
	}



	public void setTestprescription(List<TestPrescription> testprescription) {
		this.testprescription = testprescription;
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
	
	
	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", appointmentId=" + appointmentId + ", appointment="
				+ appointment + ", diagnosis=" + diagnosis + ", medicineprescription=" + medicineprescription
				+ ", testprescription=" + testprescription + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
	
	
	
}
