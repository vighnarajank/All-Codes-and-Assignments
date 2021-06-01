package com.onebill.corejava.multithread;

import java.util.ArrayList;

class storage{
	ArrayList<Integer> product = new ArrayList<Integer>(10);
	
	public synchronized void setProduct(Integer product) {
		while(this.product.size()==10) {
			try {
				System.out.println("Producer waiting.....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.product.add(product);
		System.out.println("Produced : " + product);
		notify();
	}
	
	public synchronized void getProduct() {
		while(this.product.isEmpty()) {
			try {
				System.out.println("Consumer waiting.....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : " + this.product.remove(0));
		
		notify();
	}

}

class producer implements Runnable{

	storage S;
	producer(storage st){
		this.S = st;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			S.setProduct(i++);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class consumer implements Runnable{

	storage S;
	consumer(storage st){
		this.S = st;
	}
	
	@Override
	public void run() {
		while(true) {
			S.getProduct();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ConsumerProducer {

	public static void main(String[] args) {
		storage st = new storage();
		producer p = new producer(st);
		consumer c = new consumer(st);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
