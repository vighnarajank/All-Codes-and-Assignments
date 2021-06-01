package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ElementPresent {

	public static void main(String[] args) {
		//getting limit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//getting array elements
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//element present or not
		System.out.println("Enter a number : ");
		int ind = sc.nextInt();
		sc.close();
		int i;
		for(i=0;i<n;i++) {
			if(ind==arr[i]) {
				break;
			}
		}
		System.out.println("The element is present at index ->" + (i+1));
	}
}
