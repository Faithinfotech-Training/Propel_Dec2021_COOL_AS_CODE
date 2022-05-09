package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IPrescriptionRepository;
import com.coolascode.app.entity.Prescription;

@Service
public class PrescriptionServiceImplementation implements IPrescriptionService {
	
	@Autowired
	private IPrescriptionRepository prescriptionrepo;

	//List
	@Override
	public List<Prescription> getPrescription() {
		return (List<Prescription>) prescriptionrepo.findAll();
	}

	//Insert
	@Override
	public void savePrescription(Prescription prescription) {
		prescriptionrepo.save(prescription);

	}

	//update
	@Override
	public Optional<Prescription> getPrescription(int id) {
		return prescriptionrepo.findById(id);
	}

	//delete
	@Override
	public void deletePrescription(int id) {
		prescriptionrepo.deleteById(id);

	}

}
