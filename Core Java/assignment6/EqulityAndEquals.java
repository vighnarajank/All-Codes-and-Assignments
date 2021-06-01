package com.onebill.corejava.assignment6;

public class EqulityAndEquals {

	public static void main(String[] args) {
		String c1 = "A";
		String c2 = new String("A");
		String c3 = "A";
		if(c1==c2) {								//compare object's references
			System.out.println("c1==c2");			//c1 & c2 are referring different values
		}
		if(c1==c3) {								//compare object's references
			System.out.println("c1==c3");			//c1 & c2 are referring same values
		}
		if(c1.equals(c2)) {							//compare values
			System.out.println("c1.equals(c2)");	//c1 & c2 has same values
		}
		if(c1.equals(c3)) {							//compare values
			System.out.println("c1.equals(c3)");	//c1 & c3 has same values
		}
	}

}
