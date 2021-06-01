package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class AddingMatrix {

	public static void main(String[] args) {
		//getting limit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row limit : ");
		int x = sc.nextInt();
		System.out.println("Enter the column limit : ");
		int y = sc.nextInt();
		int[][] m1 = new int[x][y];
		int[][] m2 = new int[x][y];
		int[][] sum = new int[x][y];
		
		//getting matrix elements
		int i;
		int j;
		System.out.println("Enter the Matrix-1 elements : ");
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nEnter the Matrix-2 elements : ");
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				m2[i][j] = sc.nextInt();
				//adding the matrix 1 and 2 elements
				sum[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		//Printing sum matrix
		System.out.println("\nThe sum matrix:");
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
