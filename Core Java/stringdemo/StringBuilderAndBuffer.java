package com.onebill.corejava.stringdemo;

public class StringBuilderAndBuffer {

	public static void concat1(String s1) {
		s1.concat("World");
	}
	
	public static void concat2(StringBuffer s1) {
		s1.append("World");
	}
	
	public static void concat2(StringBuilder s1) {
		s1.append("World");
	}
	
	public static void main(String[] args) {
		String s1 ="Hello ";
		concat1(s1);
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("Hello ");
		System.out.println(s2.hashCode());
		concat2(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2);
		StringBuilder s3 = new StringBuilder("Hello ");
		System.out.println(s3.hashCode());
		concat2(s3);
		System.out.println(s3.hashCode());
		System.out.println(s3);
		
		//Converting String to stringBuffer
		StringBuffer s4=new StringBuffer(s1);
		System.out.println(s4);
		
		//Converting String to stringBuilder
		StringBuilder s5=new StringBuilder(s1);
		System.out.println(s5);
				
		//converting buffer/builder to string
		s1=s4.toString();
		s1=s5.toString();
		
		//converting buffer ot builder
		StringBuffer s6 = new StringBuffer(s5);
		System.out.println(s6);
		StringBuilder s7 = new StringBuilder(s6);
		System.out.println(s7);
	}

}
