package com.onebill.corejava.staticdemo;


public class StaticBlock {

	static {
		System.out.println("This is static");
		//System.exit(0);
	}
	
	public static void main(String[] args) {
		System.out.println("This is main");
	}

}
