package com.onebill.corejava.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(2, 9);
		System.out.println(al);
		al.set(3, 12);
		System.out.println(al);
		List<Integer> l= al.subList(1, 4);
		System.out.println(l);
	}

}
