package com.coolascode.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coolascode.app.entity.Prescription;
import com.coolascode.app.service.IPrescriptionService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionRestController {
	
	@Autowired
	private IPrescriptionService prescriptionService;
	
	//Get prescription
	@GetMapping("/prescription")
	public List<Prescription> getAllPrescription() {
		return prescriptionService.getPrescription();
		
	}
	
	//Add Prescription
	@PostMapping("/prescription")
	public void addPrescription(@RequestBody Prescription prescription) {
		prescriptionService.savePrescription(prescription);
 
	}
	
	//update Prescription
	@PutMapping("/prescription")
	public void updatePrescription(@RequestBody Prescription prescription) {
		prescriptionService.savePrescription(prescription);

	}
	
	//Delete Prescription 
	@DeleteMapping("/prescription/{id}")
	public void deletePrescription(@PathVariable int id) {
		prescriptionService.deletePrescription(id);

	}


}
