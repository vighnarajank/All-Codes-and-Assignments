package com.onebill.jdbc.assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileCreation {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("DB_Uname_Pwd.properties");
			
			Properties prop = new Properties();
			prop.load(fr);
			prop.setProperty("user", "root");
			prop.setProperty("password", "admin");
			prop.store(new FileWriter("DB_Uname_Pwd.properties"), "Database User name & password");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
