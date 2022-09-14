package com.hdbstaff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdbstaff.entity.Staff;
import com.hdbstaff.service.StaffService;

@RestController
@CrossOrigin
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@PostMapping(value="/staffregister")
	public ResponseEntity<String> addStaff(@RequestBody Staff staff)
	{
		String msg = staffService.saveStaff(staff);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
