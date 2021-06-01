package com.onebill.corejava.basics;

public class TruthTable {
	public static void main(String[] args) {
		boolean p=true,q=true;
		System.out.println("___________________________________________");
		System.out.println("|  p\t|  q\t| p&q\t| p|q\t| p^q");
		System.out.println("-------------------------------------------");
		for(int i=1;i<=4;i++) {
			if(i%2==0) {
				q=false;
			}
			else {
				q=true;
			}
			System.out.print(p?"|True\t":"|False\t");
			System.out.print(q?"|True\t":"|False\t");
			System.out.print(p&q?"|True\t":"|False\t");
			System.out.print(p|q?"|True\t":"|False\t");
			System.out.println(p^q?"|True\t":"|False\t");
			if(4/i==2) {
				p=false;
			}
		}
		System.out.println("___________________________________________");
	}
}
