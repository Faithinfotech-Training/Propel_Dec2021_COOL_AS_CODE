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
@Table(name="note")
public class Note {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="note_id")
	private int noteId;

	@Column(name="prescription_id")
	private int prescriptionId;
	
	@ManyToOne
	@JoinColumn(name="prescription_id", insertable=false,updatable=false)
	private Prescription prescription;
	
	@Column(name="note_description",nullable=false,length=200)
	private String noteDescription;
	
	@Column(name="remarks",nullable=false,length=200)
	private String remarks;
	
	@Column(name="applied_date")
	private Date appliedDate;
	
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_date")
	private Date modifiedDate;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(int noteId, int prescriptionId, Prescription prescription, String noteDescription, String remarks,
			Date appliedDate, Date createdDate, Date modifiedDate) {
		super();
		this.noteId = noteId;
		this.prescriptionId = prescriptionId;
		this.prescription = prescription;
		this.noteDescription = noteDescription;
		this.remarks = remarks;
		this.appliedDate = appliedDate;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
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

	public String getNoteDescription() {
		return noteDescription;
	}

	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
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
		return "Note [noteId=" + noteId + ", prescriptionId=" + prescriptionId + ", prescription=" + prescription
				+ ", noteDescription=" + noteDescription + ", remarks=" + remarks + ", appliedDate=" + appliedDate
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	

}
