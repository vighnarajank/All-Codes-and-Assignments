package com.onebill.corejava.basics;

public class OperatorCalculation {

	public static void main(String[] args) {
		int a = 5, b = 2, c = 1, x = 10, y = 2, p = 2;
		int m = ++a * 5;
		int n = b++ - c * 2;
		p *= x / y;
		System.out.println(m +" "+ n +" "+ p);
	}

}
