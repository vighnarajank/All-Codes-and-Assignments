package com.onebill.corejava.exceptionhandling;

class ThrowsEx{
	int division (int num, int den) throws ArithmeticException{
		int q = num/den;
		System.out.println("Q = " + q);
		return q;
	}
}

public class Demo6 {

	public static void main(String[] args) {
		ThrowsEx obj = new ThrowsEx();
		int v1=10,v2=0;
		try {
			obj.division(v1, v2);
		}
		catch (ArithmeticException e){
			System.err.println("Error");
		}
	}

}
