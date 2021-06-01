package com.onebill.corejava.basics;

import java.util.Optional;

public class OptionalExample {
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println(a.isPresent());
		System.out.println(b.isPresent());
		Integer first = a.orElse(new Integer(0));
		Integer second = b.orElse(new Integer(0));
		return first+second;
	}

	public static void main(String[] args) {
		OptionalExample op = new OptionalExample();
		
		Integer v1 = new Integer(20);
		Integer v2 = new Integer(30);
		
		//ofNullable() doesn't allow passed parameter to be null
		Optional<Integer> val1 = Optional.ofNullable(v1);
		
		//of() allows passed parameter to be null
		Optional<Integer> val2 = Optional.ofNullable(v2);
		
		System.out.println("Sum is : " + op.sum(val1, val2));
	}

}
