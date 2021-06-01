package com.onebill.corejava.basics;

public class StringSwitch {

	public static void main(String[] args) {
		String str = "";
		switch (str) {
		case "Hi":
			System.out.println("Hi");
			break;
		case "Hello":
			System.out.println("Hello");
			break;
		case "Hey":
			System.out.println("Hey");
			break;
		default:
			System.out.println("Nothing to print");
			break;
		}
	}

}
