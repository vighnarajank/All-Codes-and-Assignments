//package com.onebill.corejava.assignment10;
//
//import java.lang.annotation.Repeatable;  
//import java.lang.annotation.Retention;  
//import java.lang.annotation.RetentionPolicy;
//
//
//@Repeatable(Games.class)
//@interfaceGame {
//	String game();
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@interfaceGames {
//	Game[] value();
//}
//
//@Game(game="GTA-5")
//@Game(game="Call of Duty")
//@Game(game="Need for Speed Heat")
//@Game(game="Counter Strike")
//@Game(game="Age of Empires")
//
//public class RepeatableAnnotations {
//
//	public @interface interfaceGame {
//
//	}
//
//	public @interface Repeatable {
//
//	}
//
//	public static void main(String[] args) {
//		Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);  
//		for (Game g : game) { 
//			System.out.println(g.name());  
//		} 
//	}
//
//}
