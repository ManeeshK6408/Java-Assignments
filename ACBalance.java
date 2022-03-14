// Question 13
// Account class to credit and debit cash to user
import java.util.*;
import java.io.*;

class Account {
	private double balance;

	public Account(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (amount > balance) {
			System.out.println("Debit amount exceeded balance");
		} else {
			balance = balance - amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class ACBalance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account ac1 = new Account(100000.00);
		Account ac2 = new Account(-7.52);
		int choice;
		double creditAmount, debitAmount;
		System.out.println("The balance of account 1 is: " + (ac1.getBalance()));
		System.out.println("The balance of account 2 is: " + (ac2.getBalance()));
		System.out.print("1. Credit\n2. Debit\nEnter your choice\n");
		choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the deposit amount");
			creditAmount = in.nextDouble();
			System.out.println("Adding deposit to account 1 and 2");
			ac1.credit(creditAmount);
			ac2.credit(creditAmount);
			System.out.printf("Balance of account 1 is %.2f\n", ac1.getBalance());
			System.out.printf("Balance of account 2 is %.2f\n", ac2.getBalance());
			break;
		case 2:
			System.out.println("Enter the withdrawal amount");
			debitAmount = in.nextDouble();
			System.out.println("Withdrawing " + debitAmount + " money from account 1 and 2");
			ac1.debit(debitAmount);
			ac2.debit(debitAmount);
			// 54 line does not work and shows negative value
			System.out.printf("The balance of account 1 is %.2f\n", ac1.getBalance());
			System.out.printf("The balance of account 2 is %.2f\n", ac2.getBalance());
			break;
		default:
			System.out.println("Invalid input! Please try again!!");
		}
	}
}
