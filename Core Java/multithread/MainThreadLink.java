package com.onebill.corejava.multithread;

public class MainThreadLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLink1 t1 = new ThreadLink1();
		ThreadLink2 t2 = new ThreadLink2();
		Thread mt1 = new Thread(t1);
		Thread mt2 = new Thread(t2);
		mt2.start();
		mt1.start();
		
	}

}
