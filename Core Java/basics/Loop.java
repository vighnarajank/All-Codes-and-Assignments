package com.onebill.corejava.basics;

public class Loop {

	public static void main(String[] args) {
		int pow=1,res=1;
		int base=3;
		while(pow<=base)
		{
			res*=base;
			pow++;
		}
		System.out.println(res);
			
	}

}
