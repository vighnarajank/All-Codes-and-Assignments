package com.onebill.corejava.exceptionhandling;

public class Demo4 {

	static void validate (int age) {
		if(age < 18) {
			throw new ArithmeticException("Age not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Business logic Continues...");
	}

}
