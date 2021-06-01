package com.onebill.corejava.set;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(3);
		hs.add(null);
		hs.remove(4);
		System.out.println(hs.size());
		
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
