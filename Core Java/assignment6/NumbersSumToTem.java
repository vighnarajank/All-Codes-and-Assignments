package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class NumbersSumToTem {

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
		
		//printing pairs
		System.out.println("The pairs are:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==10) {
					System.out.println(arr[i] + " " +arr[j]);
				}
			}
		}
		sc.close();
	}

}
