package com.onebill.corejava.inheritance;

class Parent{
	Parent(){
		System.out.println("Parent");
	}
	
	void overRide() {
		System.out.println("override parent");
	}
}

class Child1 extends Parent{
	Child1(){
		System.out.println("child1");
	}
	
	void overRide() {
		System.out.println("override child1");
	}
}

class Child2 extends Child1{
	Child2(){
		System.out.println("Child2");
	}
	
	void overRide() {
		System.out.println("override child2");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Child2 c=new Child2();
		c.overRide();
		}
}
