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

import com.coolascode.app.entity.MedicinePrescription;
import com.coolascode.app.service.IMedicinePrescriptionService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicinePrescriptionRestController {
	
	@Autowired
	private IMedicinePrescriptionService medicineprescriptionService;
	
	//Get all Prescription for Medicine
	@GetMapping("/medicineprescription")
	public List<MedicinePrescription> getAllMedicinePrescription() {
		return medicineprescriptionService.getMedicinePrescription();
		
	}
	
	//Add Prescription for Medicine
	@PostMapping("/medicineprescription")
	public void addMedicinePrescription(@RequestBody MedicinePrescription medicineprescription) {
		medicineprescriptionService.saveMedicinePrescription(medicineprescription);
 
	}
	
	//update Prescription for Medicine
	@PutMapping("/medicineprescription")
	public void updateMedicinePrescription(@RequestBody MedicinePrescription medicineprescription) {
		medicineprescriptionService.saveMedicinePrescription(medicineprescription);

	}
	
	//Delete Prescription for Medicine
	@DeleteMapping("/medicineprescription/{id}")
	public void deleteMedicinePrescription(@PathVariable int id) {
		medicineprescriptionService.deleteMedicinePrescription(id);

	}
	

}
