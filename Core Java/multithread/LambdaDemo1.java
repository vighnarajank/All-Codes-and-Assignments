package com.onebill.corejava.multithread;

interface MyInterface1{
	void show(int i);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface1 mi = (int i) -> {
			System.out.println(i);
		};
		mi.show(10);
	}
}

