package com.onebill.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillbankdb","root","admin");
			stmt = con.createStatement();

			try {

				boolean bool;
				bool = stmt.execute("create table employee (empid int primary key, empname varchar(50), empsalary int)");
				System.out.println("Table created successfully");
				
				if(bool == true) {
					throw new Exception("Table already present");
				}

			} catch (Exception e){
				System.err.println(e);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(con != null)
					con.close();
				if(stmt != null)
					stmt.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
