package com.onebill.corejava.assignment8;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		String[] items = { "Parota", "Dosa", "Vada", "Idli", "Poori", "Pongal", "Chicken Biriyani",
				"Veg-Biriyani", "Mashroom-Biriyani", "Fish Biriyani", "Stick Gola", "Kulfi", "Royal Falooda",
				"Chicken tikka masala", "Chicken 65", "Kulcha", "Naan", "Butter CHicken Masala",
				"Jigarthanda", "Shawarma" };
		int cost[] = { 30, 20, 10, 20, 40, 20, 100, 80, 90, 100, 40, 40, 90, 80, 80, 30, 30, 90, 40, 70 };
		int qty[] = new int[20];
		Scanner s = new Scanner(System.in);
		int ordered[] = new int[20];
		int t = 1, t1 = 1, k = 0;
		while (t == 1) {
			System.out.println("\nItems in the Restaurant :");
			System.out.println("S.No\t\tItems\t\t\tCost");
			for (int i = 0; i < 20; i++) {
				System.out.println(i + 1 + ".\t" + items[i] + "\t\t    " + cost[i]);
			}
			k = 0;
			int tamt = 0;
			t1 = 1;
			System.out.println("enter the correspoding item  and quantity to order food ");
			while (t1 == 1) {
				ordered[k] = s.nextInt();
				qty[k] = s.nextInt();
				tamt += cost[ordered[k] - 1] * qty[k];
				k++;
				System.out.println("enter 1 to continue order 0 to done");
				t1 = s.nextInt();
			}

			System.out.println("Your Bill :");
			System.out.println("S.No\t\tItems\t\t\tQuatity\t\t\tCost");
			for (int i = 0; i < k; i++) {
				System.out.println(
						i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t" + cost[ordered[i] - 1]);
			}
			System.out.println("===============================================\ntotal amout is :" + tamt);
			System.out.println("Enter the mode of pay \n 1.cash 2.card 3.gpay/phonepay");
			t1 = s.nextInt();
			switch (t1) {

			case 1:
				int amt = s.nextInt();
				if (amt == tamt) {
					System.out.println("S.No\t\tItems\t\t\tQuatity\t\t\tCost");
					for (int i = 0; i < k; i++) {
						System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
								+ cost[ordered[i] - 1]);
					}
					System.out.println("Total amout :" + tamt);
					System.out.println("//Bill status - Paid// ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("****Thank you for your visiting please come again ****");
				} else {
					System.out.println("Billing Error... Kindly Repay amonut");
					amt = s.nextInt();
					if (amt == tamt)
					System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
					for (int i = 0; i < k; i++) {
						System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
								+ cost[ordered[i] - 1]);
					}
					System.out.println("Total amout = " + tamt);
					System.out.println("...Bill status - Paid... ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("****Thank you for your visiting please come again ****");
				}
				break;
			case 2:
				System.out.println("Enter your card pin");
				int pin_no = s.nextInt();
				System.out.println("Bill:");
				System.out.println("S.No\t\tItems\t\t\tQuatity\t\t\tCost");
				for (int i = 0; i < k; i++) {
					System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
							+ cost[ordered[i] - 1]);
				}
				System.out.println("Total amout = " + tamt);
				System.out.println("...Bill status - Paid... ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("****Thank you for your visiting please come again ****");
				break;
			case 3:
				System.out.println("Scanning.....");
				System.out.println("Bill : ");
				System.out.println("S.No\t\tItems\t\t\tQuatity\t\t\tCost");
				for (int i = 0; i < k; i++) {
					System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
							+ cost[ordered[i] - 1]);
				}
				System.out.println("Total amout = " + tamt);
				System.out.println("...Bill status - Paid... ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("****Thank you for your visiting please come again ****");
				break;
			default:
				System.err.println("!...Invalid choice...!");
				break;

			}
			System.out.println("Enter 1 to Continue or 0 to Exit..../ ");
			t = s.nextInt();
		}
		s.close();
	}
}