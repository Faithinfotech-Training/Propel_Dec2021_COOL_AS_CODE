package com.coolascode.app.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.coolascode.app.dto.StaffDoctorDto;
import org.springframework.stereotype.Repository;

@Repository
public class AddStaffRepo implements IAddRepo {


    private final static String USERS_PROC = "Save_Staff_Doctor";
    
    @Autowired
    private EntityManager entityManager;
    
	@Override
	public int saveStaffDoctor(StaffDoctorDto staffdr) {
		
	        StoredProcedureQuery query = this.entityManager.createStoredProcedureQuery( USERS_PROC);
	        
	        query.registerStoredProcedureParameter("staffId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("staffNo", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("staffName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("mobile", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("genderId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("address", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("education", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("dob", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("dateOfJoining", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("userName", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("password", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("roleId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("departmentId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("specializationId", Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("consultationFees", Double.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("ResultParam", Integer.class, ParameterMode.OUT);
	        
	        query.setParameter("staffId", staffdr.getStaffId());
	        query.setParameter("staffNo", staffdr.getStaffNo());
	        query.setParameter("staffName", staffdr.getStaffName());
	        query.setParameter("mobile", staffdr.getMobile());
	        query.setParameter("email", staffdr.getEmail());
	        query.setParameter("genderId", staffdr.getGenderId());
	        query.setParameter("address", staffdr.getAddress());
	        query.setParameter("education", staffdr.getEducation());
	        query.setParameter("dob", staffdr.getDob());
	        query.setParameter("dateOfJoining", staffdr.getDateOfJoining());
	        query.setParameter("userName", staffdr.getUserName());
	        query.setParameter("password", staffdr.getPassword());
	        query.setParameter("roleId", staffdr.getRoleId());
	        query.setParameter("departmentId", staffdr.getDepartmentId());
	        query.setParameter("specializationId", staffdr.getSpecializationId());
	        query.setParameter("consultationFees", staffdr.getConsultationFees());

	        int count = ((Number) query.getOutputParameterValue("ResultParam")).intValue();
	    	return count;
	}

}
