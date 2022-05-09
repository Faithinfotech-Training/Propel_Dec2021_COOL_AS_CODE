package com.coolascode.app.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.entity.Staff;
import java.util.List;

@Repository
public interface StaffRepo extends CrudRepository<Staff, Integer> {
	

	
//	StaffDoctorDto staffdr=new StaffDoctorDto();
//	int sId=staffdr.staffId;
	//@Query(value = "CALL savestaffs();", nativeQuery = true)
	//public void saveStaffDoctor(StaffDoctorDto staffdr );

	@Query(value = "CALL Get_Dashboard_Count();", nativeQuery = true)
	public List<Dashboard> Get_Dashboard_Count();

}
