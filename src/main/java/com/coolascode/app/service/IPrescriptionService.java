package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.entity.Prescription;


public interface IPrescriptionService {
	
	//List
	public List<Prescription> getPrescription();
	
	
	//Insert/ADD
	public void savePrescription(Prescription prescription);
	
	//Update
	public Optional <Prescription> getPrescription(int id);
	
	//Delete
	public void deletePrescription(int id);

}
