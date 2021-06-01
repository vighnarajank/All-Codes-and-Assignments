package com.onebill.corejava.assignment7;

import java.util.Scanner;

class CheckBalance extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	CheckBalance() {
		System.err.println("The balance will become less than 1000...");
	}
	
}

class Transaction{
	
	int balance=1000;
	int tranc=0;
	
	void credit(int balance) {
		this.balance = balance;
		tranc=1;
	}
	
	int debit(int amt, int oldBal) {
		try {
			if(oldBal-amt <= 1000) {
				throw new CheckBalance();
			}
			else {
				System.out.println("Before debit "+this.balance);
				this.balance = oldBal - amt;
				System.out.println("After debit"+this.balance);
				tranc=2;
				return 1;
			}
		} catch (CheckBalance e) {
			System.out.println("Cash Can't be debited");
			return 0;
		}
	}
}

public class BankTransaction {

	public static void main(String[] args) {
		Transaction[] t = new Transaction[20];
		Scanner sc = new Scanner(System.in);
		int amt=0;
		int i=0;
		int oldamt=0;
		boolean bool=true;
		System.out.println("Welcome for Bank Transaction: ");
		while(bool) {
			t[i]=new Transaction();
			System.out.println("1-Credit\n2-Debit\nEnter choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to credit : ");
				amt = sc.nextInt();
				if(i==0) {
					t[i].credit(amt+t[i].balance);
					oldamt=t[i].balance;
				}
				if(i>0) {
					t[i].credit(amt+t[i-1].balance);
					oldamt=t[i].balance;
				}
				
				//printing transaction
				if(t[i].tranc==1) {
					System.out.println("Credited amount : " + amt);
					System.out.println("Balance         : " + t[i].balance);
				}
				i+=1;
				break;
				
			case 2:
				System.out.println("Enter Amount to debit : ");
				amt = sc.nextInt();
				if(t[i].debit(amt,oldamt)==1) {
					//printing transaction
					if(t[i].tranc==2) {
						System.out.println("Debited amount   : " + amt);
						System.out.println("Balance			 : " + t[i].balance);
					}
					i+=1;
				}
				else {
					System.out.println("Retry Transaction");
				}
				break;
				
			default:
				System.out.println("Enter correct choice...!");
				break;
			}
						
			System.out.println("1 - Continue\n0 - Exit\nEnter Choice : ");
			int c = sc.nextInt();
			if(c==0) {
				bool=false;
			}
		}
		sc.close();		
	}

}
