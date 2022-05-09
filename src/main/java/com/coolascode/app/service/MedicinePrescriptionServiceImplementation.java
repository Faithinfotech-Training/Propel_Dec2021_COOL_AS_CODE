package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IMedicinePrescriptionRepository;
import com.coolascode.app.entity.MedicinePrescription;

@Service
public class MedicinePrescriptionServiceImplementation implements IMedicinePrescriptionService {
	
	@Autowired
	private IMedicinePrescriptionRepository medicineprescriptionrepo;

	
	//List
	@Override
	public List<MedicinePrescription> getMedicinePrescription() {
		return (List<MedicinePrescription>) medicineprescriptionrepo.findAll();
	}
	
	
	//Insert/ADD
	@Override
	public void saveMedicinePrescription(MedicinePrescription medicineprescription) {
		medicineprescriptionrepo.save(medicineprescription);
		
	}

	//Update
	@Override
	public Optional<MedicinePrescription> getMedicinePrescription(int id) {
		return medicineprescriptionrepo.findById(id);
	}

	
	//Delete
	@Override
	public void deleteMedicinePrescription(int id) {
		medicineprescriptionrepo.deleteById(id);
		
	}



}
