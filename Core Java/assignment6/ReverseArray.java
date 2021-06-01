package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array limit : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		arr=arrayReverse(arr,n);
		System.out.println("Reversed array:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public static int[] arrayReverse(int[] array, int n) {
		int temp;
		for(int i=0,j=n-1;i<n/2;i++,j--) {
			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
