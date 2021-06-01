package com.onebill.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDelete {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillbankdb","root","admin");
			
			pstmt = con.prepareStatement("delete from employee where empid=?");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID to Delete data :");
			int id = sc.nextInt();
			
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println("Deletion Successful ! ");
			sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
