package com.onebill.corejava.assignment6;

import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {
		
		//initializations & declarations
		int[][] rider = new int[2][];
		boolean bool = true;
		rider[0] = new int[20];
		rider[1] = new int[50];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		//Business Logic Starts
		while (bool) {
			
			//rider or not
			System.out.println("Are you a Rider?\n1 for yes, 0 for no\nEnter Choice");
			int r = sc.nextInt();
			if (r == 0) {												//not allowed repeats to ask input
				System.out.println("Sorry Riders only allowed");
			}
			else {														//allowed
				
				//weekend or weekday for separating jagged arrays
				System.out.println("1-Weekday\n2-Weekend\nWhich day?");
				int day = sc.nextInt();
				
				//asks kms driven to store in rider's jagged array
				//seperated into two parts by weekend/weekday
				System.out.println("How many kilometers driven?");
				int km = sc.nextInt();
				
				//jagged array[0]
				if(day == 1) {
					//System.out.println(i+ " "+j);
					rider[day-1][i] = km;
					i += 1;
				}
				
				//jagged array [1]
				else if(day == 2) {
					//System.out.println(i+ " "+j);
					rider[day-1][j] = km;
					j += 1;
				}
				
				//printing jagged array
				int x;
				int y;
				System.out.println("Driven Kilometers for each drivers :");
				for(x=0;x<rider.length;x++) {
					if(x==0) {
						System.out.print("Weekday : ");
					}
					else {
						System.out.print("Weekend : ");
					}
					for(y=0;y<rider[x].length;y++) {
						if(rider[x][y]==0) {
							continue;
						}
						System.out.print(rider[x][y] + " ");
					}
					System.out.println();
				}
			}
			
			//continue or not prompt
			System.out.println("\nPress 1 to Continue\nPress 0 to exit");
			int choice = sc.nextInt();
			if(choice==0) {
				bool=false;
			}
		}
		sc.close();
	}
}
