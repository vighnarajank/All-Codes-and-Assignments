package com.onebill.corejava.nestedclasses;

class Outer1{
	private class Inner{
		void show() {
			System.out.println("Hi");
		}
	}
	void display() {
		Inner i = new Inner();
		i.show();
	}
}

public class InnerPrivateClass {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.display();
	}

}
