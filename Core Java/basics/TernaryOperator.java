package com.onebill.corejava.basics;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		System.out.println("Number is greater than 10 or not:\nEnter a number :");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The number is " + (num>10?"":"not ") +"greater than 10");
		sc.close();
	}
}
