package com.onebill.corejava.interfaces;

interface inter1{
	void method1();
}

interface inter2{
	void method2();
}

interface inter3 extends inter1,inter2{
	void method3();
}

class AnotherClass implements inter3{

	@Override
	public void method1() {
		System.out.println("Hi");
	}

	@Override
	public void method2() {
		System.out.println("Hello");
	}

	@Override
	public void method3() {
		System.out.println("Welcome");
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.method1();
		anotherClass.method2();
		anotherClass.method3();
	}
}
