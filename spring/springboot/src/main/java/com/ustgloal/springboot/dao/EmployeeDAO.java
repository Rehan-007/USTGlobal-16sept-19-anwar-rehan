package com.ustgloal.springboot.dao;

import java.util.List;

import com.ustgloal.springboot.dto.EmployeeBean;

public interface EmployeeDAO {

	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployees();
	
} //End of EmployeeDAO
