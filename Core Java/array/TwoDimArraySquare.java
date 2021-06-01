package com.onebill.corejava.array;

public class TwoDimArraySquare {

	public static void main(String[] args) {
		int arr[][] = new int[10][2];
		for(int j=0;j<10;j++) {
			arr[j][0]=j+1;
		}
		
		for(int j=0;j<10;j++) {
			arr[j][1]=(j+1)*(j+1);
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(arr[j][i]+ "\t");
			}
			System.out.println();
		}
	}

}
