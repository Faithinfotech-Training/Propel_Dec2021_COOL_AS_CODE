package com.coolascode.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolascode.app.dao.IAddRepo;
import com.coolascode.app.dao.StaffRepo;
import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.entity.Staff;

@Service
public class StaffServiceImple implements IStaffService {

	@Autowired
	private StaffRepo staffrepo;

	@Autowired
	private IAddRepo addRepo;
	
	@Override
	public List<Staff> getStaff() {
		
		return (List<Staff>)staffrepo.findAll();
	}

	@Override
	public void saveStaff(Staff staff) {
		
		staffrepo.save(staff);
	}

	@Override
	public Optional<Staff> getStaff(int staffId) {
		
		return staffrepo.findById(staffId);
	}

	@Override
	public void deleteStaff(int staffId) {
		staffrepo.deleteById(staffId);
		
	}

	@Override
	public int saveStaffDoctor(StaffDoctorDto staffdr) {
		
		int result=addRepo.saveStaffDoctor(staffdr);
		return result;
		
	}

	@Override
	public List<Dashboard> Get_Dashboard_Count() {		
		return staffrepo.Get_Dashboard_Count();
	}

}
