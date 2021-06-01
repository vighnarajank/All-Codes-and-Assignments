package com.onebill.corejava.basics;

class Refer {
	int var1 = 10; //instance
	int add(int var2) // var2 is formal/parameter
	{
		return var1+var2;
	}
}

public class ReferenceDemo {

	public static void main(String[] args) {
		Refer  r = new Refer(); //r is reference variable
		System.out.println(r.add(2)); //2 is actual/argument
		System.out.println(r.var1);
		System.out.println(r);
	}

}
