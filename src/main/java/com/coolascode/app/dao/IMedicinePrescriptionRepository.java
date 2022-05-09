package com.coolascode.app.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.coolascode.app.entity.MedicinePrescription;

@Repository
public interface IMedicinePrescriptionRepository extends CrudRepository<MedicinePrescription, Integer> {
	
}
