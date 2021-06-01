package com.onebill.corejava.assignment6;

public class CharSequenceInStr {

	public static void main(String[] args) {
		String str = "Vighna Rajan";
		CharSequence c = "Vighna Rajan";
		if(str.contentEquals(c)==true) {
			System.out.println("The string contains Vighna Rajan");
		}
	}

}
