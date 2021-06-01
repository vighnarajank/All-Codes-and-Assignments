package com.onebill.corejava.inheritance;

class shape {
	int height;
	int breadth;
	
	shape(int height, int breadth) {
		super();
		this.height = height;
		this.breadth = breadth;
	}

	void show() {
		System.out.println("Height: "+height+"\nBreadth: "+breadth);
	}
}
class triangle extends shape{
			triangle(int height, int breadth) {
		super(height, breadth);
		// TODO Auto-generated constructor stub
	}

			int length;
			void disp() {
				System.out.println("Height: "+height+"\nBreadth: "+breadth+"Length: "+length);
			}
			
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t = new triangle(11, 12);
		t.disp();
		t.show();
	}

}
