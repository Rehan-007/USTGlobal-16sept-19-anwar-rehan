package com.ustglobal.StdApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.StdApp.dto.StudentBean;

public class SttudentDAOImpl implements StudentDAO {

	public List<StudentBean> getAllStudent() {
		
		String url = "jdbc:mysql://localhost:3306/student_ust?user=root&password=root";
		String sql = "select * from student";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<StudentBean> result = new ArrayList<StudentBean>();
			while(rs.next()) {
				
				StudentBean bean = new StudentBean();
				
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setBranch(rs.getString("branch"));
				
				result.add(bean);
				
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//end of getAllStudent method

	public int insertIntoStudent(StudentBean bean) {
		
		String url = "jdbc:mysql://localhost:3306/student_ust?user=root&password=root";
		String sql = "insert into student values(?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getBranch());
			
			int count = pstmt.executeUpdate();
			
			return count;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}//End of InsertStudent Method
	
	public int updateStudent(StudentBean bean) {
		
		String url = "jdbc:mysql://localhost:3306/student_ust?user=root&password=root";
		String sql = "update student set name=? where id=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getId());
			
			int count = pstmt.executeUpdate();
			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}// End  Of Student Update Method
	
	public int deleteStudent(StudentBean bean) {
		
		String url = "jdbc:mysql://localhost:3306/student_ust?user=root&password=root";
		String sql = "delete from student where id=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, bean.getId());
			
			int count = pstmt.executeUpdate();
			return count;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	} // End of Delete Student Method
	
	public StudentBean searchStudent(int id) {
		
		String url = "jdbc:mysql://localhost:3306/student_ust?user=root&password=root";
		String sql = "select * from student where id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				StudentBean bean = new StudentBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setBranch(rs.getString("branch"));
				return bean;
			} else {
				return null;
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}//End of Search Student Method
	
}//End of StudentDAOImpl body ends
