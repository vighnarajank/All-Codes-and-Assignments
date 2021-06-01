package com.onebill.corejava.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterateArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		//using for loop
		System.out.println("For loop:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//using for each
		System.out.println("For Each loop:");
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		//using iterator
		System.out.println("Iterator:");
		Iterator<Integer> li = arr.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		//using list iterator (backwards
		System.out.println("List Iterator backwards:");
		ListIterator<Integer> li1 = arr.listIterator(arr.size());
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
	}

}
