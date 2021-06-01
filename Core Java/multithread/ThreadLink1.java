package com.onebill.corejava.multithread;

public class ThreadLink1 implements Runnable{

	@Override
	public void run() {
		System.out.println("This is Thread 1");
		for(int i=0;i<5;i++) {
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
