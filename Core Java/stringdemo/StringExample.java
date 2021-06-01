package com.onebill.corejava.stringdemo;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "java";
		char[] ch = {'a','b','c'};
		String s2 = new String(ch);
		String s3 = new String("Hello");
		String[] sample = {"Hi", "this", "is"};
		for (String i:sample) {
			System.out.print(i +" ");
		}
		sample[2]=sample[2].concat(" Vighna");
		System.out.println("\nChanged String:");
		for (String i:sample) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
