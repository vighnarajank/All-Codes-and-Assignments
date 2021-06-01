package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcCode {
	
	static Connection con = null;
	static Statement stmt=null;

	public static void main(String[] args) {

		try {
			//1. Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. Get DB Connection via Driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent?user=root & password=admin");

			//3. Issue SQL Queries via the connection
			//String query="insert into student values(2,'Rajan',95)"; 		//static query
			//String query1=;	//static query
			stmt = con.createStatement();
			int count = stmt.executeUpdate("update student set sname='Rajan' where sid=2");

			//4. Process result set returned y sql query
			System.out.println("No. of records modified : " + count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
