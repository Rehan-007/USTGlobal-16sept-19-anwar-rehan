package com.ustglobal.StdApp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.StdApp.dao.StudentDAO;
import com.ustglobal.StdApp.dto.StudentBean;
import com.ustglobal.StdApp.util.StudentManager;

public class SApp {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 to Display All Student Details");
		System.out.println("Enter 2 to Insert into Student ");
		System.out.println("Enter 3 to Update Student Table");
		System.out.println("Enter 4 to Delete Student Details");
		System.out.println("Enter 5 to Search for Any Student Details");
		
		Scanner sc = new Scanner(System.in);
		int en = sc.nextInt();
		
		switch(en) {
		
		case 1 :
			StudentDAO dao1 = StudentManager.getStudentDAO();
			List<StudentBean> result = dao1.getAllStudent();
			for(StudentBean bean:result) {
				System.out.println("Id : "+bean.getId());
				System.out.println("Name : "+bean.getName());
				System.out.println("Branch : "+bean.getBranch());
			}
			break;
			
		case 2:
			StudentDAO dao2 = StudentManager.getStudentDAO();
			StudentBean bean1 = new StudentBean();
			System.out.println("Enter Student Id");
			int id1 = sc.nextInt();
			bean1.setId(id1);
			
			System.out.println("Enter Name");
			String name1 = sc.next();
			bean1.setName(name1);
			
			System.out.println("Enter Branch");
			String branch1 = sc.next();
			bean1.setBranch(branch1);
			
			int count = dao2.insertIntoStudent(bean1);
			System.out.println(count+" Rows Inserted");
			break;
			
		case 3:
			StudentDAO dao3 = StudentManager.getStudentDAO();
			StudentBean bean3 = new StudentBean();
			
			System.out.println("Enter Name");
			String name3 = sc.next();
			bean3.setName(name3);
			
			System.out.println("Enter Id");
			int id3 = sc.nextInt();
			bean3.setId(id3);
			
			int count3  = dao3.updateStudent(bean3);
			System.out.println(count3+" Rows updated");
			
		case 4:
			StudentDAO dao4 = StudentManager.getStudentDAO();
			StudentBean bean4 = new StudentBean();
			
			System.out.println("Enter Id");
			int id4 = sc.nextInt();
			bean4.setId(id4);
			
			int count4 = dao4.deleteStudent(bean4);
			System.out.println(count4+" Rows Deleted");
			break;
			
		case 5:	
			StudentDAO dao5 = StudentManager.getStudentDAO();
			
			System.out.println("Enter the id");
			int id5 = sc.nextInt();
			StudentBean bean5 = dao5.searchStudent(id5);
			if(bean5 != null) {
				System.out.println("Id : "+bean5.getId());
				System.out.println("Name : "+bean5.getName());
				System.out.println("Branch : "+bean5.getBranch());
			}
		
		}//End of Switch Case
		
	}//End of Main Method
	
}//End of SApp Class Body
