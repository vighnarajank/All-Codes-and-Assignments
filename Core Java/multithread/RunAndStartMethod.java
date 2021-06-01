package com.onebill.corejava.multithread;

public class RunAndStartMethod extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		RunAndStartMethod r1 = new RunAndStartMethod();
		RunAndStartMethod r2 = new RunAndStartMethod();
		r1.start();			//thread for object r1 created start invokes run method
		//r1.start();		//removing this comment gives error since r1 thread is already started 
		r2.start();			//thread for object r2 created start invokes run method
//		r1.run();			//this just invokes the run method in AunAndStartMethod class, no new thread created
//		r1.run();			//this just invokes the run method in AunAndStartMethod class, no new thread created
	}

}
