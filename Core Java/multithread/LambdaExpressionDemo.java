package com.onebill.corejava.multithread;

interface MyInterface{
	void show();
}

/*
 * class MyClass implements MyInterface{
 * 
 * @Override public void show() { // TODO Auto-generated method stub
 * System.out.println("Hello"); }
 * 
 * }
 */

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyClass mc = new MyClass(); 
		 * mc.show();
		 */
		
		MyInterface mi = () -> System.out.println("hello");
		mi.show();
	}

}
