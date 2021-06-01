package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ArraySortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		char[] c = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			c[i] = str.charAt(i);
		}
		char temp;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(c[j]<c[i]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		str=String.valueOf(c);
		System.out.println("Ascending Order:\n"+str);
		sc.close();
	}

}
