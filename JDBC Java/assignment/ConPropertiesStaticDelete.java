package com.onebill.jdbc.assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConPropertiesStaticDelete {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {

			FileReader rdr = new FileReader("DB_Uname_Pwd.properties");

			Properties prop = new Properties();
			prop.load(rdr);

//			String user = prop.getProperty("user");
//			String pwd = prop.getProperty("password");

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillbankdb", prop);
			stmt = con.createStatement();

			stmt.execute("delete from employee where empid=2");
			System.out.println("Deleted successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
