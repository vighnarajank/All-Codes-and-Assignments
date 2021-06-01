package com.onebill.corejava.nestedclasses;

class CPU{
	static String company="Dell";
	CPU(){
		Processor p=new Processor();
		p.display();
	}
	private class Processor{
		double speed;
		String model;
		int generation;
		public Processor() {
			speed=0;
			model="Not known";
			generation=0;
		}
		double speed(String model, int generation) {
			double speed = 0;
			if (model=="i5" && generation==9) {
				speed=4.5;
			}
			return speed;
		}
		void put(int generation, String model) {
			this.generation=generation;
			this.model=model;
			this.speed=speed(this.model,this.generation);
		}
		void display() {
			put(9,"i5");
			System.out.println("Model: " +model+ "\nGeneration: " +generation+ "\nSpeed: "+speed);
		}
	}
	
	class RAM{
		String model;
		int memory;
		RAM(String model, int memory) {
			this.model=model;
			this.memory=memory;
		}
		void display(){
			System.out.println("Model: " +model+"\nMemory: "+memory);
		}
	}
}

public class TestClass {

	public static void main(String[] args) {
		CPU.RAM r = new CPU().new RAM("DDR4", 8);
		r.display();
	}

}
