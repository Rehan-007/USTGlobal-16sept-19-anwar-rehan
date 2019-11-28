package com.ustglobal.hibernateproject.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
 
	@Id
	@Column
	private int sid;
	
	@Column
	private String sname;
	
	@Column
	private int roll;
	
	
}
