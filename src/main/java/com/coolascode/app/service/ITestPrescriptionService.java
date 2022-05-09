package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.entity.TestPrescription;

public interface ITestPrescriptionService {
	
	
	//List
	public List<TestPrescription> getTestPrescription();
	
	
	//Insert/ADD
	public void saveTestPrescription(TestPrescription testprescription);
	
	//Update
	public Optional <TestPrescription> getTestPrescription(int id);
	
	//Delete
	public void deleteTestPrescription(int id);

}
