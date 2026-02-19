package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBDemo.getCon();
			Statement st = con.createStatement();
//			Create statement
//			String sql = "create table student(usn varchar(50),name varchar(50))";
//			st.execute(sql);
//			System.out.println("Table student created successfully...");
			
//			Insert statement
//			String sql1 = "insert into student values('"+"CS3"+"','"+"Ritesh"+"')";
//			int dt = st.executeUpdate(sql1);
//			if(dt>0) {
//				System.out.println("Inserted Successfully..");
//			}else {
//				System.out.println("Inserted Successfully..");
//			}
			
//			Read statement
//			String sql2 = "select * from student";
//			ResultSet rs = st.executeQuery(sql2);
//			
//			while(rs.next()) {
//				System.out.println("USN : "+rs.getString(1)+" NAME : "+rs.getString(2));
//			}
			
//			Delete Statement
//			String sql3 = "delete from student where usn = 'CS2'";
//			int count = st.executeUpdate(sql3);
//			System.out.println("Deleted Successfully...");
			
//			Update Statement
			String sql4 = "update student set usn =  'CS25' where name = 'Anush'";
			int updated = st.executeUpdate(sql4);
			System.out.println("Updated Successsfully....");
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
