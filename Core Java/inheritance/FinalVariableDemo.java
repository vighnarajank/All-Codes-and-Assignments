package com.onebill.corejava.inheritance;

class Status {
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	String[] status = {"OUTPUT ERROR", "INPUT ERROR", "DISK ERROR"};
	
	String getError(int i) {
		//this.INERR=2;	 	//cannot assign
		if(i>=0 && i<status.length) {
			return status[i];
		}
		else {
			return "INVALID CODE";
		}
	}
}

public class FinalVariableDemo {

	public static void main(String[] args) {
		Status s = new Status();
		System.out.println(s.getError(s.INERR));
	}

}
