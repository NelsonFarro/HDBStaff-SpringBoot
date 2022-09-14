package com.hdbstaff.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="staffregister")
public class Staff {

		@Id	
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="staffId")
		private BigInteger staffId;
		
		@Column(name="staffName")
		private String staffName;
	
		@Column(name="staffpass")
		private String password;
		
		@Column(name="staff_category")
		private String category;
		
		@Column(name="dOfpost")
		private LocalDateTime dateOfPost;

		@Column(name="dOfclose")
		private LocalDateTime dateOfClosing;

		
		
}
