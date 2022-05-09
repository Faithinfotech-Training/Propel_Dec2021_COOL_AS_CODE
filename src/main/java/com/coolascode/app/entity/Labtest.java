package com.coolascode.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="labtest")
public class Labtest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="test_id",nullable=false,length=50)
	private int testId;
	
	
	@Column(name="test_code",nullable=false,length=50)
	private String testCode;
	
	@Column(name="test_name", nullable=false,length=50)
	private String testName;

	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="is_active",nullable = false, columnDefinition = "TINYINT", length = 1)
	private boolean isActive;
	
	@OneToOne(mappedBy = "labtest")
	private TestPrescription testprescription;

	public Labtest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Labtest(int testId, String testCode, String testName, Date createdDate, Date modifiedDate, boolean isActive,
			TestPrescription testprescription) {
		super();
		this.testId = testId;
		this.testCode = testCode;
		this.testName = testName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isActive = isActive;
		this.testprescription = testprescription;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
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

	public TestPrescription getTestprescription() {
		return testprescription;
	}

	public void setTestprescription(TestPrescription testprescription) {
		this.testprescription = testprescription;
	}

	@Override
	public String toString() {
		return "Labtest [testId=" + testId + ", testCode=" + testCode + ", testName=" + testName + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", isActive=" + isActive + ", testprescription="
				+ testprescription + "]";
	}
	
	
}
