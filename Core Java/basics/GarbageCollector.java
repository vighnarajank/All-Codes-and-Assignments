package com.onebill.corejava.basics;

public class GarbageCollector {
	public static void main(String[] args) {
		GarbageCollector g1= new GarbageCollector();
		GarbageCollector g2= new GarbageCollector();
		g1=null;
		System.gc();
		g2=null;
		Runtime.getRuntime().gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage is collected\nCollected object is " + this);
	}
}
