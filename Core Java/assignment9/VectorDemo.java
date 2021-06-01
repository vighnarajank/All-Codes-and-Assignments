package com.onebill.corejava.assignment9;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//Vector is a class that implements list interface
		//So all methods of list interface can be used here
		//Vector is in java.util package
		//The subclass of Vector is class
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(8);
		v.add(6);
		v.add(9);
		v.add(1);
		System.out.println(v);
		v.add(2, 66);
		System.out.println(v);
		v.remove(4);				//removes the element and returns the removed element at given index
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.indexOf(1));
		System.out.println(v.size());
		System.out.println(v.toString());
		System.out.println(v.lastElement());
		System.out.println(v);
		v.set(0, 99);				//replaces the element and returns the old element at given index
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v);
	}

}
