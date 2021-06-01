package com.onebill.corejava.exceptionhandling;

public class Demo3 {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		int[] b1 = {1,0,3,0};
		try {
			for(int i=0;i<a1.length;i++) {
				try {
					System.out.println(a1[i] + " / " + b1[i] + " = " + a1[i]/b1[i]);
				} catch (ArithmeticException e) {
					System.out.println("Can't divide by zero");
				}
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound....\n! Program Terminated");
		}
	}

}
