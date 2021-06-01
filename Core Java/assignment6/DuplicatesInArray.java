package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class DuplicatesInArray {

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
		
		//duplicate calculation
		int[] numbers = new int[10];
		System.out.println("Duplicate Elements:");
		for(int i=0;i<n;i++) {
			numbers[arr[i]]=++numbers[arr[i]];
		}
		
		//printing duplicate elements
		for(int i=0;i<10;i++) {
			if(numbers[i]>1) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
