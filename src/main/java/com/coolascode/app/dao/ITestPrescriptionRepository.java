package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.TestPrescription;

@Repository
public interface ITestPrescriptionRepository extends CrudRepository<TestPrescription, Integer> {

}
