package com.onebill.jdbc.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadFromFile {
	
	public static void main(String[] args) {
		File obj = new File("Data.txt");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			if (obj.createNewFile()) {
				System.out.println("File successfully created : " + obj.getName());
			} else {
				System.err.println("File already exists");
			}
			
			FileReader rdr = new FileReader(obj);
			Scanner sc = new Scanner(rdr);
			String s = sc.nextLine();
			sc.close();
			String[] words = s.split("\\W+");
			int id = Integer.parseInt(words[0]);
			int salary = Integer.parseInt(words[2]);
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillbankdb","root","admin");
			
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, words[1]);			
			pstmt.setInt(3, salary);

			pstmt.execute();
			System.out.println("Insertion Successful");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
