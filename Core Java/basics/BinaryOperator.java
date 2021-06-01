package com.onebill.corejava.basics;

public class BinaryOperator {

	public static void main(String[] args) {
		int x=1,y=2,z=3;
		x|=y;
		y^=z;
		z&=x;
		System.out.println(x + " " + y + " " + z);
	}

}
