package com.onebill.corejava.assignment7;

import java.io.FileOutputStream;

public class TryWithResources {

	public static void main(String[] args) {
		try(FileOutputStream f = new FileOutputStream("C:\\Users\\Vighna-RK\\eclipse-workspace\\ExampleDemonstration\\src\\com\\onebill\\corejava\\assignment7\\text.txt")){
			//FileOutputStream f = new FileOutputStream("C:\\Users\\Vighna-RK\\eclipse-workspace\\ExampleDemonstration\\src\\com\\onebill\\corejava\\assignment7\\text.txt");
			String s = "Hello Vighna";
			byte[] b = s.getBytes();
			f.write(b);
			System.out.println("Message Successfully Written in the File");
			//f.close();
		} catch (Exception e) {
			System.out.println("No File Found");
		}
	}

}
