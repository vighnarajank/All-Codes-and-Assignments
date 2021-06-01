package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class SecondSmallAndLarge {

	public static void main(String[] args) {
		//getting limit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//getting array elements
		int small=999999;
		int gtr=-1;
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			//finding smallest & largest
			if(arr[i]<=small) {
				small=arr[i];
			}
			
			if(arr[i]>=gtr) {
				gtr=arr[i];
			}
			
		}
		
		//making the smallest & largest values as -1
		for(int i=0;i<n;i++) {
			
			if(arr[i]==small || arr[i]==gtr) {
				arr[i]=-1;
			}
			
		}
		
		//finding second smallest & largest
		small=999999;
		gtr=-1;
		for(int i=0;i<n;i++) {
			
			if(arr[i]!=-1) {
				
				if(arr[i]<=small) {
					small=arr[i];
				}
				
				if(arr[i]>=gtr) {
					gtr=arr[i];
				}
				
			}
			
		}
		//printing second greatest & smallest
		System.out.println("\nSecond Greatest : " + gtr + "\nSecond Smallest : " +small);
		sc.close();
	}

}
