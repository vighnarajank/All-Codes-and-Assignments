package com.onebill.corejava.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("one", 1);
		h1.put("two", 2);
		h1.put("three", 3);
		
		Set<Map.Entry<String, Integer>> m1 = h1.entrySet();
		for(Entry<String, Integer> entry : m1) {
			System.out.print(entry.getKey()+"=");
			System.out.println(entry.getValue());
		}
		
		Set<String> s1 =h1.keySet();
		for(String string:s1) {
			System.out.println(string);
		}
		
		Collection<Integer> s2 = h1.values();
		for(Integer integer : s2) {
			System.out.println(integer);
		}
	}

}
