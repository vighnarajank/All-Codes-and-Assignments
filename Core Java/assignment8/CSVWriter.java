package com.onebill.corejava.assignment8;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("test.csv");
			System.out.println("Writing Data to CSV.....");
			w.append("Student-ID");
			w.append(',');
			w.append("Name");
			w.append(',');
			w.append('\n');
			w.append("1718155");
			w.append(',');
			w.append("Vighna Rajan K");
			w.append(',');
			w.append('\n');
			w.append("1718156");
			w.append(',');
			w.append("Praveen");
			w.append(',');
			w.append('\n');
			w.append("1718157");
			w.append(',');
			w.append("Bala");
			w.append(',');
			w.append('\n');
			System.out.println("Data Written to CSV Successfully.");
			w.flush();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
