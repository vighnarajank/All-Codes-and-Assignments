package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelect {

	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent?user=root & password=admin");
			String query = "select * from student where sid=?";
			pstmt = con.prepareStatement(query);
			
			String sid = args[0];
			int s_id = Integer.parseInt(sid);
			pstmt.setInt(1, s_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int stid = rs.getInt("sid");
				String name = rs.getString("sname");
				int marks = rs.getInt("marks");
				System.out.println("Sid\tsname\tmarks");
				System.out.println(stid + "\t" + name + "\t" + marks);
				System.out.println("----------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();
				if(rs!=null)
					rs.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
