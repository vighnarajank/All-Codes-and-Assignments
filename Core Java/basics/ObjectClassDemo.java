package com.onebill.corejava.basics;

public class ObjectClassDemo {

	public static void main(String[] args) {
		ObjectClassDemo obj = new ObjectClassDemo();
		ObjectClassDemo obj1 = new ObjectClassDemo();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj1));
		System.out.println(obj.getClass());
		obj1=obj;
		System.out.println(obj.equals(obj1));
	}

}
