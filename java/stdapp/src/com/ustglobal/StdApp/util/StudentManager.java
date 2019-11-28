package com.ustglobal.StdApp.util;

import com.ustglobal.StdApp.dao.SttudentDAOImpl;
import com.ustglobal.StdApp.dao.StudentDAO;

public class StudentManager {
	
	private StudentManager() {
		
	}

	public static StudentDAO getStudentDAO() {
		return new SttudentDAOImpl();
	}
	
}
