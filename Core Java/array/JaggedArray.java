package com.onebill.corejava.array;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// Length DEMO also here
		int[] list = new int[10];
		int[] num = {1,2,3,4,5};
		int arr[][] = new int[3][];
		arr[0]= new int[]{1,2,3};
		arr[1]= new int[]{1,2,3,4,5};
		arr[2]= new int[]{1,2};
		
		for(int[] x:arr) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("\nLength of list: " + list.length);
		System.out.println("Length of num: " + num.length);
		System.out.println("Length of arr: " + arr.length);
		System.out.println("Length of arr[0]: " + arr[0].length);
		System.out.println("Length of arr[1]: " + arr[1].length);
		System.out.println("Length of arr[2]: " + arr[2].length);
	}

}
