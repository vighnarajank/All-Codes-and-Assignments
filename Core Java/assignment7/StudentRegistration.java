package com.onebill.corejava.assignment7;

import java.util.Scanner;

class AgeWeightException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	AgeWeightException(int unit, String prop, int limit) {
		super();
		System.err.println("The " + prop + " '" + unit + "' is less than " + limit + " which is not valid!");
	}
	
}

class Student {
	int age=0;
	String name="Not known";
	int weight=0;
	
	public Student(int age, String name,int weight) {
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	
	int checkAge() {
		try {
			if(age < 12) {
				throw new AgeWeightException(age, "age", 12);
			}
			else {	
				return 0;
			}
		} catch (AgeWeightException e) {
			System.out.println("Error for Student '" + name +"'");
			System.out.println("Renter Data\n");
			return 1;
		}
	}
	
	int checkWeight() {
		try {
			if(weight < 35) {
				throw new AgeWeightException(weight, "weight", 35);
			}
			else {
				
				return 0;
			}
		} catch (AgeWeightException e) {
			System.out.println("Error for Student '" + name +"'");
			System.out.println("Renter Data\n");
			return 1;
		}
	}
}

public class StudentRegistration {

	public static void main(String[] args) {
		
		// Initializations & Declarations
		Student[] stu = new Student[10];
		boolean bool = true;
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		while(bool) {
			//initializing constructor
			stu[i] = new Student(0,"NotKnown",0);
			
			//getting data input
			System.out.println("Enter Name   : ");
			String name = sc.next();
			System.out.println("Enter Age    : ");
			int age = sc.nextInt();
			System.out.println("Enter Weight : ");
			int weight = sc.nextInt();
			stu[i].name=name;
			stu[i].age=age;
			stu[i].weight=weight;
			
			//checks for errors
			if(stu[i].checkAge()==0 && stu[i].checkWeight()==0) {		//0 is no error & 1 is error
				
				//printing data
				System.out.println("\nName   : " + stu[i].name);
				System.out.println("Age    : " + stu[i].age);
				System.out.println("Weight : " + stu[i].weight);
				
				//continue or not
				System.out.println("Enter 1 to Continue or 0 to Exit :");
				int choice = sc.nextInt();
				if(choice == 0) {
					bool = false;
				}
				
				//incrementing database
				i+=1;
				
				try {
					if(i==10) {
						throw new ArithmeticException();
					}
					else {
						continue;
					}
				} catch (ArithmeticException ex) {
					System.err.println("Student Database Full");
					System.exit(0);
				}
			}
		}
		
		//printing all data
		try {
			System.out.println("\nStudent database:");
			for(i=0;i<stu.length;i++) {
				System.out.println("Name   : " + stu[i].name);
				System.out.println("Age    : " + stu[i].age);
				System.out.println("Weight : " + stu[i].weight);
			}
		} catch (NullPointerException e) {
			System.out.print("Database still left out...");
		}
		
		sc.close();
	}

}
