package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.entity.MedicinePrescription;

public interface IMedicinePrescriptionService {
	
	
	//List
	public List<MedicinePrescription> getMedicinePrescription();
	
	
	//Insert/ADD
	public void saveMedicinePrescription(MedicinePrescription medicineprescription);
	
	//Update
	public Optional <MedicinePrescription> getMedicinePrescription(int id);
	
	//Delete
	public void deleteMedicinePrescription(int id);


}
