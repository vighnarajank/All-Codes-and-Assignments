package com.onebill.corejava.basics;

import java.util.Scanner;

public class FindQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println("Enter a letter:");
			str=sc.next();
			char q=str.charAt(0);
			if(q=='q') {
				System.out.println("You found the letter q");
				break;
			}
			else {
				System.out.println("Try again!");
			}
		}while(true);
		sc.close();
	}

}
