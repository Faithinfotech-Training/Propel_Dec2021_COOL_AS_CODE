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

import com.coolascode.app.entity.TestPrescription;
import com.coolascode.app.service.ITestPrescriptionService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestPrescriptionRestController {
	
	@Autowired
	private ITestPrescriptionService testprescriptionervice;
	
	//Get all Prescription for Lab Test
	@GetMapping("/testprescription")
	public List<TestPrescription> getAllTestPrescription() {
		return testprescriptionervice.getTestPrescription();
		
	}
	
	//Add Prescription for Lab Test
	@PostMapping("/testprescription")
	public void addTestPrescription(@RequestBody TestPrescription testprescription) {
		testprescriptionervice.saveTestPrescription(testprescription);
 
	}
	
	//update Prescription for Lab Test
	@PutMapping("/testprescription")
	public void updateTestPrescription(@RequestBody TestPrescription testprescription) {
		testprescriptionervice.saveTestPrescription(testprescription);

	}
	
	//Delete Prescription for Lab Test
	@DeleteMapping("/testprescription/{id}")
	public void deleteTestPrescription(@PathVariable int id) {
		testprescriptionervice.deleteTestPrescription(id);

	}

}
