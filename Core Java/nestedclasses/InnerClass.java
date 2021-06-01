package com.onebill.corejava.nestedclasses;

class Outer{
	class Inner{
		void show() {
			System.out.println("Hi");
		}
	}
}

public class InnerClass {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		//Outer.Inner i = new Outer().new Inner();
		//i.show();
		inner.show();
	}

}
