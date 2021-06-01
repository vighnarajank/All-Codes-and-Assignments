package com.onebill.corejava.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person(10,"Vighna"));
		plist.add(new Person(8,"Rajan"));
		plist.add(new Person(20,"K"));
		Collections.sort(plist);
		for(Person p : plist) {
			System.out.println(p.getId() + " " + p.getName());
		}
	}

}
