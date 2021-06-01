package com.onebill.corejava.multithread;

class MultiThreadR implements Runnable{
	String name;
	public MultiThreadR(String name) {
		super();
		this.name = name;
	}
	public synchronized void run() {
		System.out.println(name + " : Thread " + Thread.currentThread().getId() + " is running...");
	}
}

public class MultiThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			MultiThreadR o1 = new MultiThreadR("vighna");
			MultiThreadR o2 = new MultiThreadR("Rajan");
			Thread obj1 = new Thread(o1);
			Thread obj2 = new Thread(o2);
			obj1.start();
			obj2.start();			
		}
	}

}
