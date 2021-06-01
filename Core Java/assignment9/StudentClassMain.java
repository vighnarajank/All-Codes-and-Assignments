package com.onebill.corejava.assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StudentClassMain {

	public static void main(String[] args) {
		HashSet<StudentClass> hs = new HashSet<StudentClass>();
		StudentClass sc1 = new StudentClass(2, "Rajan", 88);
		StudentClass sc2= new StudentClass(1, "Vighna", 90);
		StudentClass sc3= new StudentClass(4, "Kumar", 99);
		StudentClass sc4= new StudentClass(5, "Praveen", 80);
		StudentClass sc5= new StudentClass(8, "Raj", 70);
		hs.add(sc1);
		hs.add(sc2);
		hs.add(sc3);
		hs.add(sc4);
		hs.add(sc5);
		List <StudentClass> ls = new ArrayList<StudentClass>(hs);
		Collections.sort(ls);
		System.out.println(hs);
		System.out.println(hs.contains(new StudentClass(1, "Vighna", 90)));
	}

}
