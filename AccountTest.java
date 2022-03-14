//Question 13
//Account balance
import java.util.*;
class Account1 {
    private double balance;
    public Account1(double initialBalance) {
    
    if (initialBalance > 0.0) balance=initialBalance;
    }
    
    public void credit(double amount){
    balance=balance+amount;
    }
    
    public void debit(double amount){
    balance=balance-amount;
    
    }
    
    public double getBalance(){
    return balance;
    }
    }

public class AccountTest {
    public static void main (String args[]){
    Account1 account1 = new Account1 (50.00);
    Account1 account2 = new Account1 (-7.53);
    
    System.out.printf("Account1 Balance: $%.2f\n", account1.getBalance());
    System.out.printf("Account2 Balance: $%.2f\n\n", account2.getBalance());
    
    Scanner input = new Scanner( System.in );
    double depositAmount;
    double debitAmount;
    System.out.print( "Enter deposit amount for account1: " ); // prompt
    depositAmount = input.nextDouble(); // obtain user input
    System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
    account1.credit( depositAmount ); // add to account1 balance
    // display balances
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    
    System.out.print( "Enter deposit amount for account2: " ); // prompt
    depositAmount = input.nextDouble(); // obtain user input
    System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
    account2.credit( depositAmount ); // add to account2 balance
    
    // display balances
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
    
    System.out.print( "Enter debit amount for account1: " );
    debitAmount = input.nextDouble();
    System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
    if (account1.getBalance()>=debitAmount) {
    account1.debit( debitAmount );
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    }
    else {
    System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
    }
    
    // display balances
    System.out.print( "Enter debit amount for account2: " );
    debitAmount = input.nextDouble();
    System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", debitAmount );
    if (account1.getBalance()>=debitAmount) {
    account1.debit( debitAmount );
    System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
    System.out.printf( "Account2 balance: $%.2f\n\n", account2.getBalance() );
    }
    else {
    System.out.printf("!!!Debit amount exceeded account balance!!!\n\n");
    }
    }
}