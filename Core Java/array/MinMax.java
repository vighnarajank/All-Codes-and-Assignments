package com.onebill.corejava.array;

public class MinMax {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int min=0;
		int max=0;
		for(int i=0;i<10;i++) {
			arr[i]=i;
		}
		min=max=arr[0];
		for(int i=0; i<9; i++) {
			max=max>arr[i+1] ? max : arr[i+1];
			min=min<arr[i+1] ? min : arr[i+1];
		}
		System.out.println(min +" "+max);
	}

}
