package com.onebill.corejava.exceptionhandling;

import java.io.IOException;

public class Example7 {

	public static char prompt(String str) throws IOException {
		System.out.println(str);
		return (char) System.in.read();
	}
	
	public static void main(String[] args) {
		char ch;
		try {
			ch = prompt("Enter character : ");
		}
		catch (IOException e){
			System.err.println("IO Exception Occured");
			ch='z';
		}
		System.out.println("Character is : " +  ch);
	}

}
