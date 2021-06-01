package com.onebill.corejava.set;

import java.util.Comparator;

public class SortByPersonName implements Comparator<TreeSetPerson>{

	@Override
	public int compare(TreeSetPerson o1, TreeSetPerson o2) {
		// TODO Auto-generated method stub
		//return 0;
		return o1.pname.compareTo(o2.pname);
	}
	
}
