package com.onebill.corejava.multithread;

import java.util.Date;

interface DateInterface{
	int process();
	static Date nowDate() {
		return new Date();
	}
	default String formatDate(Date date) {
		return date.toString();
	}
	default int calculate(int a, int b) {
		return a+b;
	}
}

public class LambdaDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateInterface ref = () -> 100;
		Date date = new Date();
		System.out.println(ref.process());
		ref.formatDate(date);
		System.out.println(ref.calculate(2, 3));
		System.out.println(DateInterface.nowDate());
	}

}
