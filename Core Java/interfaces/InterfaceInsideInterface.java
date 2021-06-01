package com.onebill.corejava.interfaces;

import com.onebill.corejava.interfaces.Testing.Testing1;

interface Testing{
	interface Testing1{
		void methodInner();
	}
	void methodOuter();
}

class Inter implements Testing, Testing.Testing1{

	@Override
	public void methodInner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodOuter() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		Testing t;
		Testing1 t1;
		Inter i = new Inter();
		t=i;
		t1=i;
		i.methodInner();
		i.methodOuter();
		t.methodOuter();
		t1.methodInner();
	}

}
