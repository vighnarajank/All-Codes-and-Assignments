package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ArraySortInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:\n");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
