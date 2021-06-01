package com.onebill.corejava.arraylist;

import java.util.ArrayList;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<String>();
		as.add("Hello");
		as.add("Vighna");
		as.add("Rajan");
		
		String[] s = new String[as.size()];
		for(int i=0; i<s.length;i++) {
			s[i] = as.get(i);
		}
		for(String str : s) {
			System.out.println(str);
		}
	}

}
