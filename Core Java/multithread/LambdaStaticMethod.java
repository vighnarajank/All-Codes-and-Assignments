package com.onebill.corejava.multithread;

interface MyInterface2{
	void show(int i);		//Abstract by default
	default void normalMethod() {
		System.out.println("default");
	}
	static void staticMethod() {
		System.out.println("static");
	}
}

public class LambdaStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface2 my2 = (int x)->{
			System.out.println("Abstract 	" + x);
		};
		my2.show(10);
		my2.normalMethod();
		MyInterface2.staticMethod();
	}

}
