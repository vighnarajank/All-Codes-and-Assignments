package com.onebill.corejava.assignment8;

import java.util.Scanner;

class Storage {
	int MAX_CAPACITY = 100;
	int capacity;

	void toCalculate(int type, int no_of_items) {
		if (type == 1) {
			if((capacity+no_of_items)>MAX_CAPACITY) {
				System.err.println("Storage filled....! Try giving less items");
			}
			else {
				capacity += no_of_items;
				System.out.println("Storage  : "+capacity);
			}



		} else {
			if((capacity-no_of_items)<0) {
				System.err.println("Empty storage....!");
			}
			else {
				capacity -= no_of_items;
				System.out.println("Storage  : "+capacity);
			}

		}

	}
}

class Producer extends Thread {
	int produce_no_of_items;
	Storage p_storage;

	public Producer(Storage obj) {
		p_storage = obj;
	}

	void input(Scanner sc) {
		System.out.println("Enter the no. of items to be produce : ");
		produce_no_of_items = sc.nextInt();
	}

	@Override
	public void run() {

		p_storage.toCalculate(1, produce_no_of_items);
	}
}
class Consumer extends Thread {
	int consumer_no_of_items;
	Storage c_storage;

	public Consumer(Storage obj) {
		c_storage = obj;
	}

	void input(Scanner sc) {
		System.out.println("Enter the no. of items to be consume : ");
		consumer_no_of_items = sc.nextInt();
	}

	@Override
	public void run() {

		c_storage.toCalculate(2, consumer_no_of_items);
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		int ch,exit=1;
		Scanner sc = new Scanner(System.in);
		Storage obj = new Storage();
		Producer producer = new Producer(obj);
		Consumer consumer = new Consumer(obj);
		while(exit==1) {
			System.out.println(" 1 : Producer\n 2 : Consumer\n 3 :Exit\nEnter the choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1: 
				producer.input(sc);
				producer.run();
				break;
			case 2: 
				consumer.input(sc);
				consumer.run();
				break;
			case 3 : 
				exit=0;

			}
		}

	}

}