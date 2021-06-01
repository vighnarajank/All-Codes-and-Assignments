package com.onebill.corejava.interfaces;

class test{
	interface testing{
		void method1();
	}
}

class test1{
	interface testing1{
		void method2();
	}
}

class TestingClass implements test.testing,test1.testing1{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceInsideClass {

	public static void main(String[] args) {
		test1.testing1 t = new TestingClass();
		TestingClass tc = new TestingClass();
		t.method2();
		tc.method1();
		tc.method1();
	}

}
