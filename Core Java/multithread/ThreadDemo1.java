package com.onebill.corejava.multithread;

public class ThreadDemo1 implements Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread("1st");
		Thread t2 = new Thread("2st");
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.hashCode());
		System.out.println(t1.isAlive());
		
		System.out.println();
		
		t2.start();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.hashCode());
		System.out.println(t2.isAlive());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
