package com.onebill.corejava.exceptionhandling;

class Demo {
		public static void genExc(int what) {
			int[] num = new int[2];
			try {
				switch(what) {
				case 0: int a =10/what;
						System.out.println(a);
						break;
				case 1: num[3]=4;
						break;
				case 2: System.out.println("No error");
						break;
				}
			}
			catch(ArithmeticException e) {
				System.out.println("ari exc");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("arr out");
			}
			finally {
				System.out.println("100% done");
			}
		}
}

public class Demo10 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			Demo.genExc(i);
		}
	}

}
