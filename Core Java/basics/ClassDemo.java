package com.onebill.corejava.basics;

class Demo {
	int x;
	String y;
	Demo(){
		x=0;
		y="Not known";
	}
	Demo(int x){
		//this();
		this.x=x;
	}
	Demo(int x,String y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(11);
		Demo d3 = new Demo(10,"hello");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
	}

}
