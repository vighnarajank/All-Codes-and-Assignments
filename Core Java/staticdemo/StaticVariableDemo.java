package com.onebill.corejava.staticdemo;

class Employee{
	int empid;
	String empname;
	static String companyname="Onebill";
	void display() {
		System.out.println(empid + " " + empname + " " + companyname);
	}
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(111, "Raj");
		Employee e2 = new Employee(222, "Ram");
		
		e1.display();
		Employee.companyname="TestYantra";
		e2.display();
	}

}
