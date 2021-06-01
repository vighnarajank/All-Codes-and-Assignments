package com.onebill.corejava.multithread;

class Printer {
	 synchronized void printDoc(int num, String name) {
		for(int i=1;i<=num;i++) {
			System.out.println(">>>print Doc... <<< "+name+ "-" + i );
		}
	}
}

class VighnaThread implements Runnable{
	Printer ref;
	public VighnaThread(Printer p) {
		ref=p;
	}
	public void run() {
		ref.printDoc(10, "Vighna.pdf");
	}
}

class PraveenThread implements Runnable{
	Printer ref1;
	public PraveenThread(Printer p) {
		ref1=p;
	}
	public void run() {
		ref1.printDoc(10, "Praveen.pdf");
	}
}

public class SyncWithoutBlock {

	public static void main(String[] args) {
		System.out.println("Started....");
		Printer print = new Printer();
		
		VighnaThread t1 = new VighnaThread(print);
		PraveenThread t2 = new PraveenThread(print);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}

}
