package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean bool = true;
		int temp=0;
		while(bool) {
			System.out.println("Enter position	  :");
			int p = sc.nextInt();
			p-=1;
			for(int i=p; i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			System.out.println("New array :");
			temp+=1;
			for(int i=0; i<n-temp; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\nTo continue press 1\nTo exit press anything");
			int t=sc.nextInt();
			if(t==1) {
				bool=true;
			}
			else {
				bool=false;
			}
		}
		sc.close();
	}
}
