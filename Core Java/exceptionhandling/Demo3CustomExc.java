package com.onebill.corejava.exceptionhandling;

//NotIntException

class NonIntException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonIntException(String s) {
		super(s);
	}
}

public class Demo3CustomExc {

	public static void main(String[] args) {
		float[] a1 = {1,2,5,4,5,6};
		float[] b1 = {1,0,3,0};
		try {
			for(int i=0;i<a1.length;i++) {
				try {
					if(b1[i]==0) {
						throw new ArithmeticException();
					}
					if((a1[i]/b1[i])%1 != 0) {
						throw new NonIntException("Result is not of int type");
					}
					System.out.println(a1[i] + " / " + b1[i] + " = " + a1[i]/b1[i]);
				} catch (ArithmeticException e) {
					System.out.println("Can't divide by zero");
				} catch (NonIntException ex){
					System.out.println(ex.getMessage());
				}
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound....\n! Program Terminated");
		}
	}

}
