package com.onebill.corejava.array;

public class SimpleArray {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int twoDArray[][] = new int[3][3]; 
//		int arr[] = new int[10];

//		int arr[] = {0,1,2,3,4,5,6,7,8,9}
		
//		int arr[] = new int[10];
//		arr[0] = 0;
//		arr[1] = 1;
//		......& so on
		
		int i;
//		for(i=0;i<10;i++) {
//			arr[i]=i;
//		}
		
		for(i=0;i<10;i++) {
			System.out.println("Array["+i+"] : "+arr[i]);
		}
		
		for(i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				twoDArray[i][j] = j; 
			}
		}
	}

}
