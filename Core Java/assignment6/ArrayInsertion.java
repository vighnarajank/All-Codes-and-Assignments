package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter position	  :");
		int p = sc.nextInt();
		System.out.println("Enter Element     :");
		int x = sc.nextInt();
		sc.close();									//scanner closed
		for(int i=n; i>=p;i--) {
			arr[i]=arr[i-1];
		}
		arr[p-1]=x;
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
