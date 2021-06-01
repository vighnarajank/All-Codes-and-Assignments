package com.onebill.corejava.basics;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate someDate = LocalDate.of(2012, Month.AUGUST, 2);
		System.out.println(someDate);
		
		LocalDate someDate1 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(someDate1);
	}

}
