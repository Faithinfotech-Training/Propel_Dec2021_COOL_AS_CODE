package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IMedicinePrescriptionRepository;
import com.coolascode.app.dao.ITestPrescriptionRepository;
import com.coolascode.app.entity.MedicinePrescription;
import com.coolascode.app.entity.TestPrescription;

@Service
public class TestPrescriptionServiceImplementation implements ITestPrescriptionService {
	
	@Autowired
	private ITestPrescriptionRepository testprescriptionrepo;

	
	//List
	@Override
	public List<TestPrescription> getTestPrescription() {
		return (List<TestPrescription>) testprescriptionrepo.findAll();
	}

	
	//Insert/ADD
	@Override
	public void saveTestPrescription(TestPrescription testprescription) {
		testprescriptionrepo.save(testprescription);

	}

	//update
	@Override
	public Optional<TestPrescription> getTestPrescription(int id) {
		return testprescriptionrepo.findById(id);
	}

	//Delete
	@Override
	public void deleteTestPrescription(int id) {
		testprescriptionrepo.deleteById(id);

	}

}
