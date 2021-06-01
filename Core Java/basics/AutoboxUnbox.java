package com.onebill.corejava.basics;

import java.util.Scanner;

import static java.lang.System.*;

public class AutoboxUnbox {

	public static void main(String[] args) {
		Integer x;
		Scanner in = new Scanner(System.in);
		out.println("Enter an 'int' value to be stored in 'Integer'-x: ");
		x = in.nextInt(); //Autobox happens here
		out.println("Autobox: The Primitive 'int' value is automatically  converted to Instance 'x' of Integer Wrapper Class/Number class :"+ x);
		int y=10;
		y=x;
		if(x==y) //Unboxing happens here
		//Here the 'Integer' instance x is automatically converted to 'int' primitive; {x.intValue()>y} happens automatically
		{
			out.println("Integer is exual to int " + x);
		}
		in.close();
	}

}
