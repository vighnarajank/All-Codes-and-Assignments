package com.onebill.corejava.assignment8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("demo.txt");
		try {
			FileReader rdr = new FileReader(f);
			Scanner sc = new Scanner(rdr);
			System.out.println("Reading data....");
			System.out.println(sc.nextLine());
			System.out.println("File read Successfully");
			
			Properties prop = new Properties();
			prop.load(rdr);
			System.out.println("Setting property data...");
			prop.setProperty("user", "Vighna");
			prop.setProperty("email", "vighna.rajan@onebillsoftware.com");
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("email"));
			
			prop.store(new FileWriter("demoInfo.properties"), "This is Vighna");
			
			File  f1 = new File("demoInfo.properties");
			FileReader rdr1 = new FileReader(f1);
			Scanner sc1 = new Scanner(rdr);
			System.out.println("Reading Property data....");
			System.out.println(prop.getProperty("user"));
			System.out.println("User property read Successfully");
			rdr.close();
			rdr1.close();
			sc.close();
			sc1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
