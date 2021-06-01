package com.onebill.corejava.multithread;

class MultiThreadE extends Thread{
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is runnung");
	}
}

public class MultiThreadExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			//Thread obj = new Thread(new MultiThreadE());
			MultiThreadE obj = new MultiThreadE();
			obj.start();
		}
	}

}
