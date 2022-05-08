package com.coolascode.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gender")
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="gender_id")
	private int genderId;

	@Column(name="gender_name",nullable=false,length=20)
	private String genderName;

	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gender(int genderId, String genderName) {
		super();
		this.genderId = genderId;
		this.genderName = genderName;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
	
}
