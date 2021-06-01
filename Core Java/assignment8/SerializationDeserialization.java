package com.onebill.corejava.assignment8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class DataClass implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int a;
	String b;
	
	public DataClass(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
}

public class SerializationDeserialization {

	public static void main(String[] args) {
		
		DataClass dc = new DataClass(1,"-Vighna");
		String fname = "tet.txt";
		//Till this the program happens within the program
		
		try {
			FileOutputStream fos = new FileOutputStream(fname);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dc);
			System.out.println("Data Serialized....");
			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		DataClass dc1 = null;
		
		try {
			FileInputStream fis = new FileInputStream(fname);
			ObjectInputStream ois = new ObjectInputStream(fis);
			dc1 = (DataClass) ois.readObject();
			System.out.println("Data deserialized....");
			ois.close();
			fis.close();
			
			System.out.println(dc1.a);
			System.out.println(dc1.b);
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
