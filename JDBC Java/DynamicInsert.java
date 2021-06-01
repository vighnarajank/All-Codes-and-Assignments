package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInsert {
	
	static Connection con = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent","root","admin");
			String query = "insert into student values(?,?,?)";
			pstmt = con.prepareStatement(query);
			String s_id=args[0];
			String s_name=args[1];
			String s_marks=args[2];
			int sid = Integer.parseInt(s_id);
			int marks = Integer.parseInt(s_marks);
			pstmt.setInt(1, sid);
			pstmt.setString(2, s_name);
			pstmt.setInt(3, marks);
			boolean bool = pstmt.execute();
			System.out.println("Insertion Successful : " + !bool);
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
