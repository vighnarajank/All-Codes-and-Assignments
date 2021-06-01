package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticSelectDemo {

	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent?user=root & password=admin");
			String query = "select * from student";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int sid = rs.getInt("sid");
				String name = rs.getString("sname");
				int marks = rs.getInt("marks");
				System.out.println("Sid\tsname\tmarks");
				System.out.println(sid + "\t" + name + "\t" + marks);
				System.out.println("----------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
