	package com.onebill.corejava.multithread;

public class ThreadLink2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This is Thread 2");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
