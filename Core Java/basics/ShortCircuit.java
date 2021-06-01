package com.onebill.corejava.basics;


public class ShortCircuit {

	public static void main(String[] args) {
		if(false && true && true)
			System.out.println("hdn");
		if(true || false || false)
			System.out.println("jdskjk");
	}

}
