package com.onebill.corejava.basics;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime specificTime = LocalTime.of(21, 40, 50);
		System.out.println(specificTime);
		
		LocalTime zoneBasedTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zoneBasedTime);
	}

}
