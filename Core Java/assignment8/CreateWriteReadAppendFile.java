package com.onebill.corejava.assignment8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class CreateWriteReadAppendFile {
	public static void main(String[] args) {
		try {
			File obj = new File("vighna.txt");
			if (obj.createNewFile()) {
				System.out.println("File successfully created : " + obj.getName());
			} else {
				System.err.println("File already exists");
				System.out.println("Eligible to read & write data");
				FileWriter wtr = new FileWriter(obj);
				System.out.println("Writing new data...");
				wtr.write("Hello vighna");
				//wtr.close();
				System.out.println("Written to file Successfully");
				
				System.out.println("Appending data....");
				wtr.append(" Rajan");
				System.out.println("Data Appended");
				wtr.close();
				
				FileReader rdr = new FileReader(obj);
				Scanner sc = new Scanner(rdr);
				System.out.println("Reading data....");
				System.out.println(sc.nextLine());
				System.out.println("File read Successfully");
				
				File  f1 = new File("demoInfo.properties");
				FileReader rdr1 = new FileReader(f1);
				Properties prop = new Properties();
				prop.load(rdr1);
				System.out.println(prop.getProperty("user"));
				rdr.close();
				sc.close();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}