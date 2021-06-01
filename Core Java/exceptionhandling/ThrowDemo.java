package com.onebill.corejava.exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Manual exception using throw");
			throw new ArithmeticException();		//manually throwing exception
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception printed");
		}
		System.out.println("Program terminated");
	}

}
