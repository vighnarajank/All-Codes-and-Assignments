package com.onebill.corejava.basics;

import java.util.Scanner;

import static java.lang.Math.*;

public class RootsOfQuadEqu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Roots of quadratic equation:\nEnter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		sc.close();
		double r1 = (-b+(sqrt((b*b)-(4*a*c))))/(2*a);
		double r2 = (-b-(sqrt((b*b)-(4*a*c))))/(2*a);
		System.out.println("Root 1 = " + r1 + "\nRoot 2 = " + r2);
	}
}
