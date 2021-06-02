package com.onebill.corejava.assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentDatastructureSort {

	public static void main(String[] args) {

		ArrayList<StudentDatabase> sd= new ArrayList<StudentDatabase>();
		sd.add(new StudentDatabase(10, "Vighna", 99, 21));
		sd.add(new StudentDatabase(6, "Kumar", 50, 26));
		sd.add(new StudentDatabase(12, "Rajan", 80, 20));
		sd.add(new StudentDatabase(2, "Aadharsh", 70, 29));

		for(StudentDatabase stud : sd) {
			System.out.println(stud);
		}

		System.out.println("Sort by:\n1.ID\n2.Name\n3.Marks\n4.Age\nEnter choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Comparator<StudentDatabase> com1 = new Comparator<StudentDatabase>() {


				@Override
				public int compare(StudentDatabase o1, StudentDatabase o2) {
					if(o1.id>o2.id)
						return 1;
					else 
						return -1;
				}
			};
			Collections.sort(sd, com1);
			for(StudentDatabase stud : sd) {
				System.out.println(stud);
			}
			break;
		case 2:
			Comparator<StudentDatabase> com2 = new Comparator<StudentDatabase>() {


				@Override
				public int compare(StudentDatabase o1, StudentDatabase o2) {
					int temp = o1.name.compareTo(o2.name);
					if(temp>0)
						return 1;
					else 
						return -1;
				}
			};
			Collections.sort(sd, com2);
			for(StudentDatabase stud : sd) {
				System.out.println(stud);
			}
			break;
		case 3:
			Comparator<StudentDatabase> com3 = new Comparator<StudentDatabase>() {


				@Override
				public int compare(StudentDatabase o1, StudentDatabase o2) {
					if(o1.marks>o2.marks)
						return 1;
					else 
						return -1;
				}
			};
			Collections.sort(sd, com3);
			for(StudentDatabase stud : sd) {
				System.out.println(stud);
			}
			break;
		case 4:
			Comparator<StudentDatabase> com4 = new Comparator<StudentDatabase>() {


				@Override
				public int compare(StudentDatabase o1, StudentDatabase o2) {
					if(o1.age>o2.age)
						return 1;
					else 
						return -1;
				}
			};
			Collections.sort(sd, com4);
			for(StudentDatabase stud : sd) {
				System.out.println(stud);
			}
			break;
		}
		sc.close();
	}

}
