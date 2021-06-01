package com.onebill.corejava.basics;

public class IJKMain extends K implements I,J {

	public static void main(String[] args) {
		K k = new K();
		k.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello from I");
	}

}
