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
@Table(name="testprescription")
public class TestPrescription {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="testprescription_id")
	private int testprescriptionId;
	
	@Column(name="prescription_id")
	private int prescriptionId;
	
	@ManyToOne
	@JoinColumn(name="prescription_id", insertable=false,updatable=false)
	private Prescription prescription;
	
	@Column(name="test_id")
	private int testId;
	
	@OneToOne
	@JoinColumn(name="test_id", insertable=false,updatable=false)
	private Labtest labtest;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	public TestPrescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestPrescription(int testprescriptionId, int prescriptionId, Prescription prescription, int testId,
			Labtest labtest, Date createdDate, Date modifiedDate) {
		super();
		this.testprescriptionId = testprescriptionId;
		this.prescriptionId = prescriptionId;
		this.prescription = prescription;
		this.testId = testId;
		this.labtest = labtest;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public int getTestprescriptionId() {
		return testprescriptionId;
	}

	public void setTestprescriptionId(int testprescriptionId) {
		this.testprescriptionId = testprescriptionId;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public Labtest getLabtest() {
		return labtest;
	}

	public void setLabtest(Labtest labtest) {
		this.labtest = labtest;
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
		return "TestPrescription [testprescriptionId=" + testprescriptionId + ", prescriptionId=" + prescriptionId
				+ ", prescription=" + prescription + ", testId=" + testId + ", labtest=" + labtest + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	

}
