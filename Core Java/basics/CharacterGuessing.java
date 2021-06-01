package com.onebill.corejava.basics;

import java.util.Scanner;

public class CharacterGuessing {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char inp;
		while(true) {
			try {
				System.out.print("Enter the character that has line & curve in it:");
				inp=s.next().charAt(0);
				if((inp >= 'a' && inp <='z') || (inp >= 'A' && inp <='Z')) {
					if(inp=='q') {
						System.out.println("!You have found the correct character 'y'");
						break;
					}
					else {
						System.out.println("Try again!!");
					}
				}
				else {
					throw new Exception();
				}
			}
			catch(Exception e) {
				System.out.println("CharacterException : Enter only alphabets");
			}
		}
		s.close();
	}

}
