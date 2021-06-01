package com.onebill.corejava.interfaces;

interface Demo{
	void method1();
	void method2();
}

public class InterfaceDemo implements Demo {

	public static void main(String[] args) {
		Demo d = new InterfaceDemo();
		Demo d1Demo = new Demo() {
			public void method1() {
				System.out.println("Vighna");
			}

			public void method2() {
				System.out.println("Rajan");
			}
		};
		d1Demo.method1();
		d1Demo.method2();
		d.method1();
		d.method2();
		
	}

	public void method1() {
		System.out.println("Hi");
	}

	public void method2() {
		System.out.println("Hello");
	}

}
