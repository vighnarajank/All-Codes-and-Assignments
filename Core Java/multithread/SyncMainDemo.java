package com.onebill.corejava.multithread;

public class SyncMainDemo {

	public static void main(String[] args) {
		SyncMethod syn = new SyncMethod();
		
		Runnable ref1 = () -> {
			synchronized (syn) {
				syn.printTable(2);
			}
		};
		Runnable ref2 = () -> {
			synchronized (syn) {
				syn.printTable(5);
			}
		};
		
		Thread t1 = new Thread(ref1);
		Thread t2 = new Thread(ref2);
		t1.start();
		t2.start();
	}

}
