package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.entity.Staff;


public interface IStaffService {
	
	//List
	public List<Staff> getStaff();
	
	//Insert/Update
	public void saveStaff(Staff staff);
	
	//Insert/Update
	public int saveStaffDoctor(StaffDoctorDto staffdr);

	//Insert/Update
	public List<Dashboard> Get_Dashboard_Count();
		
	//Search by id
	public Optional<Staff> getStaff(int staffId);
	

	//Delete
	public void deleteStaff(int staffId);
}
