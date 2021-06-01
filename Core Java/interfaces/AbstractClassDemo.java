package com.onebill.corejava.interfaces;

abstract class Shape{
	abstract void draw();
}

class Rect extends Shape{
	void draw() {
		System.out.println("Hi");
	}
}

class Tri extends Shape{
	void draw() {
		System.out.println("Hello");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Shape s1 = new Rect();
		s1.draw();
		Shape s2 = new Tri();
		s2.draw();
	}
}
