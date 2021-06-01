package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicUpdate {

	static Connection con = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent","root","admin");
			String query = "update student set sname=?,marks=? where sid=7";
			pstmt = con.prepareStatement(query);
			String s_marks=args[1];
			String s_name=args[0];
			int marks = Integer.parseInt(s_marks);
			pstmt.setString(1, s_name);
			pstmt.setInt(2, marks);
			pstmt.executeUpdate();
			System.out.println("Update Successful : ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
