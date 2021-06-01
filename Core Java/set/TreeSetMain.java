package com.onebill.corejava.set;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<TreeSetPerson> ts = new TreeSet<TreeSetPerson>(new SortByPersonName());
		ts.add(new TreeSetPerson(26,"Vighna"));
		ts.add(new TreeSetPerson(19,"Kumar"));
		ts.add(new TreeSetPerson(21,"Arya"));
		ts.add(new TreeSetPerson(80,"Ram"));
		for(TreeSetPerson p:ts) {
			System.out.println(p.getName());
		}
	}

}
