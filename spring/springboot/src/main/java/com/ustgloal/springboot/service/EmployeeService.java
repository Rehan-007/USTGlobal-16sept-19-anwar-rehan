package com.ustgloal.springboot.service;

import java.util.List;

import com.ustgloal.springboot.dto.EmployeeBean;

public interface EmployeeService {

	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployees();
	
}
