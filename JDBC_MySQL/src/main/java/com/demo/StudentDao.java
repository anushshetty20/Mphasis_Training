package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.test.EmpDao;

public class StudentDao {
	public static Connection getCon() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mlafeb";
		String user = "root";
		String pas = "root@39";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pas);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void saveStudent(Student s) {
		try {
			String sql = "insert into student(usn,name,college) values(?,?,?)";
			Connection con = StudentDao.getCon();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s.getUsn());
			pst.setString(2, s.getName());
			pst.setString(3, s.getCollege());
			
			pst.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> getAllStudent(){
		List<Student> stuList = new ArrayList<>();
		try {
			String sql = "select * from student";
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setUsn(rs.getString(1));
				s.setName(rs.getString(2));
				s.setCollege(rs.getString(3));
				stuList.add(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stuList;
	}
	
	public void updateStudent(Student s) {
		try {
			String sql = "update student set name = ?, college = ? where usn = ?";
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCollege());
			pst.setString(3, s.getUsn());
			pst.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(String usn) {
		try {
			String sql = "delete from student where usn = ?";
			PreparedStatement pst = StudentDao.getCon().prepareStatement(sql);
			pst.setString(1, usn);
			pst.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
