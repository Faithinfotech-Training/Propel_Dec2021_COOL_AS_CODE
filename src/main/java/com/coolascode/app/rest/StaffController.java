package com.coolascode.app.rest;

import java.util.List;
import java.util.Optional;

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

import com.coolascode.app.dto.Dashboard;
import com.coolascode.app.dto.StaffDoctorDto;
import com.coolascode.app.entity.Staff;
import com.coolascode.app.service.IStaffService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StaffController {

	@Autowired
	public IStaffService staffservice;
	
	
	//Get all Employee
	@GetMapping("/staffs")
	public List<Staff> getAllCustomer() {	
		return (List<Staff>)staffservice.getStaff();
	}
	
	
	//Get Employee by Id
	@GetMapping("/staffs/{staffId}")
	public Optional<Staff> getCustomer(@PathVariable int staffId) {
		
		return staffservice.getStaff(staffId);
	}
	

	
	//Get Employee by Id
	@GetMapping("/dashboard")
	public List<Dashboard> Get_Dashboard_Count() {
		return (List<Dashboard>)staffservice.Get_Dashboard_Count();
		
	}
	//Add Employee
	@PostMapping("/emp")
	public void saveCustomer(@RequestBody Staff staff) {
		staffservice.saveStaff(staff);

	}

	
	//Add Employee
	@PostMapping("/staffs")
	public int saveStaffDoctor(@RequestBody StaffDoctorDto staffdr) {
		return staffservice.saveStaffDoctor(staffdr);
	}
	
	//Update Employee
	@PutMapping("/staffs")
	public void updateStaff(@RequestBody Staff staff) {
		staffservice.saveStaff(staff);

	}
	
	
	//Delete Employee
	@DeleteMapping("/staffs/{staffId}")
	public void deleteStaff(@PathVariable int staffId) {
		staffservice.deleteStaff(staffId);
	}
}
