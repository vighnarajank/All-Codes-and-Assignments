package com.onebill.corejava.exceptionhandling;

class GenerateException {
	static void generateException() {
		int[] i = new int[3];
		System.out.println("hi");
		i[2] = 5;
		i[2] = 5/0;
		System.out.println("Hello");
	}
}


public class ExcDemo2 {
	
	public static void main(String[] args) {
		try {
			GenerateException.generateException();
		}
		
		//Removing comment in this catch block makes error in code, since
		//'Exception' is super class and it must not be present at top
		/*
		 * catch (Exception e) { System.out.println("Generalized exception...."); }
		 */
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Oops! Index Out of Bound error occured!");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmitic Exception");
		}
		System.out.println("After exception");
		System.out.println("Hello");
	}

}
