package com.onebill.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {



	public static void main(String[] args) {

		Connection con = null;
		Statement stmnt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
			stmnt = con.createStatement();
			
			try{
				
				boolean bool = stmnt.execute("create database OneBillBankDB");
				System.out.println("Database created successfully");
				
				if(bool == true) {
					throw new Exception(); 
				}
			
			} catch (Exception e){
				System.err.println("Database already present");
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found");
		
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {

			try {
				if(con != null) 
					con.close();
				if(stmnt != null) 
					stmnt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


}

