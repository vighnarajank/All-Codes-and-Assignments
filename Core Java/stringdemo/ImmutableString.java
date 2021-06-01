package com.onebill.corejava.stringdemo;

public class ImmutableString {

	public static void main(String[] args) {
		String s = "Vighna";
		String s1 = "Vighna";
		System.out.println(s.hashCode());		
		s = s + " Rajan";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println();
	}

}
