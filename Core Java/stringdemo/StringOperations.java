package com.onebill.corejava.stringdemo;

public class StringOperations {

	public static void main(String[] args) {
		String s1 = "Hi everyone";
		System.out.println(s1.length());
		System.out.println(s1.compareTo("Hi everyone"));
		System.out.println(s1.contains("ev"));
		System.out.println(s1.indexOf('e', 4));
	}

}
