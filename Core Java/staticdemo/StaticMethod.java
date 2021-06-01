package com.onebill.corejava.staticdemo;

class Employee1{
	int empid;
	String empname;
	static String companyname="Onebill";
	void display() {
		System.out.println(empid + " " + empname + " " + companyname);
	}
	public Employee1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	static void changename() {
		companyname="TestYantra";
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(111, "Raj");
		Employee1 e2 = new Employee1(222, "Ram");
		e1.display();
		Employee1.changename();

		e2.display();
	}

}
