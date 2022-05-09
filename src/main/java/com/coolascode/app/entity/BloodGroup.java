package com.coolascode.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blood_group")
public class BloodGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="blood_group_id")
	private int bloodGroupId;

	@Column(name="blood_group_name",nullable=false,length=20)
	private String bloodGroupName;
	

	public BloodGroup() {
		
	}

	public BloodGroup(int blood_group_id, String blood_group_name) {
		super();
		this.bloodGroupId = blood_group_id;
		this.bloodGroupName = blood_group_name;
	}

	public int getBloodGroupId() {
		return bloodGroupId;
	}

	public void setBloodGroupId(int bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}

	public String getBloodGroupName() {
		return bloodGroupName;
	}

	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}


}
