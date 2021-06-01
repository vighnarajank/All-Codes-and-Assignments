package com.onebill.corejava.multithread;

public class SyncMethod {
	public void printTable(int num) {
		for(int i=1;i<=10;i++)
			System.out.println(i*num);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
