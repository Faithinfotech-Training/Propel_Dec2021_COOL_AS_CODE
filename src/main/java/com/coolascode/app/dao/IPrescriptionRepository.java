package com.coolascode.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.entity.Prescription;

@Repository
public interface IPrescriptionRepository extends CrudRepository<Prescription, Integer> {

}
