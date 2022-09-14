package com.hdbstaff.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdbstaff.entity.Staff;
import com.hdbstaff.repository.StaffRepo;

@Service
public class StaffServiceImpl implements StaffService{
	
	private StaffRepo staffRepo;
	
	 public StaffServiceImpl(StaffRepo repository) {
		this.staffRepo = repository;
	}
	
	@Override
	public String saveStaff(Staff staff) {

		BigInteger staffId= staff.getStaffId();
		staffRepo.save(staff);
		
		if(staffId==null)
		{
			return "Record not Inserted";
		}
		else
		{
			return "Record Inserted Sucssfully";
		}
	}

}
