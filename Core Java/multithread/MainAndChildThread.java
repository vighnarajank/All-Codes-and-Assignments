package com.onebill.corejava.multithread;

class Mythread implements Runnable{
	
	String Threadname;
	
	public Mythread(String tname) {
		Threadname=tname;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) 
			try {
				System.out.println("In" + Threadname + " Count is : " + i);
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}

public class MainAndChildThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread Starts...");
		Mythread mt = new Mythread("Child Thread");
		Thread newThread = new Thread(mt);
		newThread.start();
		for(int i=0;i<10;i++) {
			try {
				System.out.println("In main Count is : " +i);
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
