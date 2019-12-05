package com.ustgloal.springboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeBean> employeebean;
	
}
