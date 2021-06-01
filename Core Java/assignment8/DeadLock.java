package com.onebill.corejava.assignment8;

public class DeadLock {
	public static void main(String[] args) {
		final String r1 = "Vighna";
		final String r2 = "Rajan";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("Hi Vighna");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (r2) {
						System.out.println("Hi Rajan");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (r2) {
					System.out.println("Hello Vighna");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (r1) {
						System.out.println("Hello Rajan");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
