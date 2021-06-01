package com.onebill.corejava.assignment7;

public class RethrowUsingThrows {

	public static void method() throws Exception {
		System.out.println("method");
		throw new Exception();
	}

	public static void method1() throws Exception {
		try {
			method();
		} catch(Exception e) {
			System.out.println("method1");
			throw e;
		}
	}
	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main method");
		}
	}
}