package com.ustglobal.StdApp.dao;

import java.util.List;

import com.ustglobal.StdApp.dto.StudentBean;

public interface StudentDAO {

	public List<StudentBean> getAllStudent();
	public int insertIntoStudent(StudentBean bean);
	public int updateStudent(StudentBean bean);
	public int deleteStudent(StudentBean bean);
	public StudentBean searchStudent(int id);
	
}
