package com.hdbstaff.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdbstaff.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Serializable>{

}
