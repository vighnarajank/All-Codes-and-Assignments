package com.onebill.corejava.basics;

import java.util.Scanner;

public class SyntaxNestedSwitch {

	public static void main(String[] args) {
		System.out.println("Syntax Finding:");
		System.out.println("1.Sequential\n2.Iteration\n3.Jump");
		System.out.print("Input:");
		Scanner sc = new Scanner(System.in);
		int choose=sc.nextInt();
		switch(choose) {
			case 1:
				System.out.println("\n1.if\n2.if-else\n3.Nested if\n4.switch");
				System.out.print("Input:");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("\nSyntax :\nif (condition) {\r\n" + 
								"  // block of code to be executed if the condition is true\r\n" + 
								"}");
						break;
					case 2:
						System.out.println("if (condition) {\r\n" + 
								"  // block of code to be executed if the condition is true\r\n" + 
								"} else {\r\n" + 
								"  // block of code to be executed if the condition is false\r\n" + 
								"}");
						break;
					case 3:
						System.out.println("if (condition1) {\r\n" + 
								"  // block of code to be executed if condition1 is true\r\n" + 
								"} else if (condition2) {\r\n" + 
								"  // block of code to be executed if the condition1 is false and condition2 is true\r\n" + 
								"} else {\r\n" + 
								"  // block of code to be executed if the condition1 is false and condition2 is false\r\n" + 
								"}");
						break;
					case 4:
						System.out.println("switch(expression) {\r\n" + 
								"  case x:\r\n" + 
								"    // code block\r\n" + 
								"    break;\r\n" + 
								"  case y:\r\n" + 
								"    // code block\r\n" + 
								"    break;\r\n" + 
								"  default:\r\n" + 
								"    // code block\r\n" + 
								"}");
						break;
					default:
						System.out.println("Enter correct choice");
				}
				break;
			case 2:
				System.out.println("\n1.for\n2.while\n3.do-while");
				System.out.print("Input:");
				choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("for (statement 1; statement 2; statement 3) {\r\n" + 
								"  // code block to be executed\r\n" + 
								"}");
						break;
					case 2:
						System.out.println("while (test_expression)\r\n" + 
								"{\r\n" + 
								"   // statements\r\n" + 
								" \r\n" + 
								"  update_expression;\r\n" + 
								"}");
						break;
					case 3:
						System.out.println("do{  \r\n" + 
								"//code to be executed  \r\n" + 
								"  update_expression;\r\n" +
								"}while(condition); ");
						break;
				}
				break;
			case 3:
				System.out.println("\n1.break\n2.continue\n3.return");
				System.out.print("Input:");
				choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("break;");
						break;
					case 2:
						System.out.println("continue;");
						break;
					case 3:
						System.out.println("return 'value';");
						break;
					default:
						System.out.println("Enter correct choice");
				}
				break;
			default:
				System.out.println("Enter correct choice");
		}
		sc.close();
	}

}
