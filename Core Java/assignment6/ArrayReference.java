package com.onebill.corejava.assignment6;

public class ArrayReference {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,4,3,2,1};
		arr1=arr2;
		arr1[3]=99;
		for(int i : arr1)
			System.out.println(i + " ");
	}

}
