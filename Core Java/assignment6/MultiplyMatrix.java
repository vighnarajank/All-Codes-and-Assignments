package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		//getting limit
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row-1 limit 	 : ");
		int x1 = sc.nextInt();
		System.out.print("Enter the Column-1 limit : ");
		int y1 = sc.nextInt();
		System.out.print("\nEnter the Row-2 limit 	 : ");
		int x2 = sc.nextInt();
		System.out.print("Enter the Column-2 limit : ");
		int y2 = sc.nextInt();
		
		if(y1==x2) {										//checking limit
			int[][] m1 = new int[x1][y1];
			int[][] m2 = new int[x2][y2];
			int[][] mult = new int[x1][y2];
			
			//getting matrix elements
			int i;
			int j;
			int k=0;
			System.out.println("\nEnter the Matrix-1 elements : ");
			for(i=0;i<x1;i++) {
				for(j=0;j<y1;j++) {
					m1[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nEnter the Matrix-2 elements : ");
			for(i=0;i<x2;i++) {
				for(j=0;j<y2;j++) {
					m2[i][j] = sc.nextInt();
				}
			}
			
			//multiplying the matrix 1 and 2 elements
			for(i=0;i<x1;i++) {
				for(j=0;j<y2;j++) {
					for(k=0;k<y1;k++) {
						mult[i][j] += (m1[i][k] * m2[k][j]);
					}
				}
			}
			
			//Printing multiplied matrix
			System.out.println("\nThe sum matrix:");
			for(i=0;i<x1;i++) {
				for(j=0;j<y2;j++) {
					System.out.print(mult[i][j] + "\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("y1 & x2 must be equal");
		}
		sc.close();
	}
}
