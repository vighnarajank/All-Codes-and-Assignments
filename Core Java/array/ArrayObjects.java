package com.onebill.corejava.array;

class Student {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class ArrayObjects {

	public static void main(String[] args) {
		Student[] s=new Student[3];
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		s[0].setId(1);
		s[0].setName("n1");
		System.out.println(s[0].getId() + " " + s[0].getName());
		s[1].setId(2);
		s[1].setName("n2");
		System.out.println(s[1].getId() + " " + s[1].getName());
		s[2].setId(3);
		s[2].setName("n3");
		System.out.println(s[2].getId() + " " + s[2].getName());
	}

}
