/**
 * 
 */
package javaAssingment1And2;

import java.util.Scanner;

/**
 *  Assume that a Bank maintains two kinds of accounts for its customers, one called savings
	account and the other current account. The savings account provides compound interest and
	withdrawal facilities. The current account provides no interest. Current account holders
	should maintain balance and if the balance falls below this level, a service charge is imposed.
	
		o Create a class Account that stores customers name, account number and type of the
		  account. From this derive the classes CurAccount and SavAccount to make them
		  more specific to their requirements.
		
		o Include the necessary methods in order to achieve the following tasks:
			Assign initial values
			Accept deposit from a customer and update the balance
			Permit withdrawal and update the balance
			Compute and deposit interest
			Check for the minimum balance, impose penalty, if necessary, and update it.
			Display the balance
		
		o Write a program that creates an array of Bank Account and displays a menu that lets a
		  new account to be created, perform deposit and withdrawal transactions on the basis
		  of account number, display the balance of account holder for whom the account
		  number is provided.
 */

class Account{
	protected String name;
	protected int accNumber;
	protected String accType;
	protected double balance;
	
	public Account(String name, int accNumber, double balance, String accType) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
		this.accType = accType;
	}
	
	public void withDraw(int amount){
		if(this.balance>=amount){
			this.balance-=amount;
			System.out.println(amount+" is withDrawn SuccessFully");
			System.out.println("Available Balance : " + this.balance);
		}else{
			System.out.println("Insufficient Balance");
		}
	}
	
	public void deposit (int amount){
		this.balance+=amount;
		System.out.println(amount+" is Deposited SuccessFully");
		System.out.println("Available Balance : " + this.balance);
	}
	
	public void displayDetails(){
		System.out.println("Acoount Holder Name : "+ this.name);
		System.out.println("Account Number : " + this.accNumber);
		System.out.println("Account Type : "+ this.accType);
		System.out.println("Available Balance : " + this.balance);
	}
	
	// Override this functions and add those features mention  
	public void displayBalance() {
		
	}
	public void checkMinimumBalance() {
		
	}
	public void depositeIntrest() {
		
	}
	
}

class CurrentAccount extends Account{
	final double minumumBalance;
	final double serviceCharge;
	final double interestRate;


	public CurrentAccount(String name, int accNumber, double balance,String accType, double currentInterestRate, double currentMinumumBalance, double currentServiceCharge) {
		super(name, accNumber, balance, accType);
		this.interestRate = currentInterestRate;
		this.minumumBalance = currentMinumumBalance;
		this.serviceCharge = currentServiceCharge;
	}
	 
	public void checkMinimumBalance(){
		if(super.balance <= minumumBalance){
			super.balance-=this.serviceCharge;
			System.out.println("Low Balance penalty");
		}
	}
	
	public void depositeIntrest(){
		double i = super.balance *(this.interestRate/100);
		this.balance+=i;
		System.out.println("Intrest Deposited.");
		System.out.println("Updated Balance " +super.balance);
	}
	
}


class savingsAccount extends Account{
	final double interestRate;
	final double minumumBalance;
	final double serviceCharge;
	
	public savingsAccount(String name, int accNumber,int balance, String accType, double savingsInterestRate, double savingsMinumumBalance, double savingsServiceCharge) {
		super(name, accNumber, balance, accType);
		this.interestRate = savingsInterestRate;
		this.minumumBalance = savingsMinumumBalance;
		this.serviceCharge = savingsServiceCharge;
		
	}
	
	public void depositeIntrest(){
		double i = super.balance *(this.interestRate/100);
		this.balance+=i;
		System.out.println("Intrest Deposited.");
		System.out.println("Updated Balance " +super.balance);
	}
	
	public void checkMinimumBalance(){
		if(super.balance <= minumumBalance){
			super.balance-=this.serviceCharge;
			System.out.println("Low Balance penalty");
		}
	}
}


public class InheritanceQ6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize Savings accounts dependency
		final double savingsInterestRate = 8;
		final double savingsMinumumBalance = 300;
		final double savingsServiceCharge =100;
		
		// initialize Current accounts dependency
		final double currentInterestRate = 4;
		final double currentMinumumBalance = 2000;
		final double currentServiceCharge = 500;
		
		int size = 5;
		Scanner scanner = new Scanner(System.in);
		// Array of Bank Accounts
		Account[] accounts = new Account[size];
		
		System.out.println("Welcome to this system is made by Ayan Saha:)");
		
		int option;
		do {
			// Main menu
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Create new account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Display balance");
			System.out.println("5. Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.print("Enter your choice: ");
			option = scanner.nextInt();
			switch (option) {
			
			case 1:
				// Create Account section
				scanner.nextLine();
				System.out.print("Enter customer name: ");
				String name = scanner.nextLine();
				System.out.print("Enter account number: <With in 1-5>");
				int accNumber = scanner.nextInt();
				System.out.print("Enter initial balance: ");
				int initialBalance = scanner.nextInt();
				System.out.print("Enter account type (Current/Savings): ");
				String accType = scanner.next();
				
				// Account Type Checking
				if (accType.equalsIgnoreCase("Current")) {
					accounts[accNumber - 1] = new CurrentAccount(name, accNumber, initialBalance , "Current" , currentInterestRate, currentMinumumBalance, currentServiceCharge);
		
				} else if (accType.equalsIgnoreCase("Savings")) {
					accounts[accNumber - 1] = new savingsAccount(name, accNumber, initialBalance, "Savings", savingsInterestRate, savingsMinumumBalance, savingsServiceCharge);
				} else {
					System.out.println("Invalid account type.");
				}
				break;
				
			case 2:
				// Deposit Section
				System.out.print("Enter account number: ");
				int depositAccNumber = scanner.nextInt();
				
				if(depositAccNumber>size && depositAccNumber<=0) {
					System.out.println("Max Size of the Array is : "+ size);
					break;
					
				}else{
					int depositAmount;
					
					if(accounts[depositAccNumber - 1].accType.equalsIgnoreCase("Current") ) {
						System.out.print("Enter deposit amount: ");
						depositAmount = scanner.nextInt();
						accounts[depositAccNumber - 1].deposit(depositAmount);
						accounts[depositAccNumber - 1].depositeIntrest(); // Interest added as per the Current account
						break;
						
					}else if (accounts[depositAccNumber - 1].accType.equalsIgnoreCase("Savings")){
						System.out.print("Enter deposit amount: ");
						depositAmount = scanner.nextInt();
						accounts[depositAccNumber - 1].deposit(depositAmount);
						accounts[depositAccNumber - 1].depositeIntrest(); // Interest added as per the Savings account
						break;
						
					}else {
						System.out.println("Network Issue");
						break;
					}
				}
				
				
			case 3:
				System.out.print("Enter account number: ");
				int withdrawAccNumber = scanner.nextInt();
				if(withdrawAccNumber>size && withdrawAccNumber<=0) {
					System.out.println("Max Size of the Array is : "+ size);
					break;
				}else {
					int withdrawAmount;
					if(accounts[withdrawAccNumber - 1].accType.equalsIgnoreCase("Current")) {
						System.out.print("Enter withdrawal amount: ");
						withdrawAmount = scanner.nextInt();
						accounts[withdrawAccNumber - 1].withDraw(withdrawAmount);
						accounts[withdrawAccNumber - 1].checkMinimumBalance(); // Giving Low Balance penalty as per the Current account
						break;
						
					}else if(accounts[withdrawAccNumber - 1].accType.equalsIgnoreCase("Savings")) {
						System.out.print("Enter withdrawal amount: ");
						withdrawAmount = scanner.nextInt();
						accounts[withdrawAccNumber - 1].withDraw(withdrawAmount);
						accounts[withdrawAccNumber - 1].checkMinimumBalance(); // Giving Low Balance penalty as per the Savings account
						break;
						
					}else {
						System.out.println("Network Issue");
						break;
					}
					
				}
				
				
			case 4:
				System.out.print("Enter account number: ");
				int displayAccNumber = scanner.nextInt();
				if(displayAccNumber>size && displayAccNumber<=0) {
					System.out.println("Max Size of the Array is : "+ size);
					break;
				}else{
					accounts[displayAccNumber - 1].displayDetails();
					break;
				}
				
				
			case 5:
				System.out.println("Thanks For using this System:)");
				break;
				
			default: System.out.println("Invalid choice. Please try again.");
			
			}
		} while (option != 5);
		scanner.close();
	}

}
/*
 Output->
Welcome to this system is made by Ayan Saha:)
 ~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 1
Enter customer name: Ayan Saha
Enter account number: <With in 1-5>2
Enter initial balance: 4000
Enter account type (Current/Savings): current
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 4
Enter account number: 2
Acoount Holder Name : Ayan Saha
Account Number : 2
Account Type : Current
Available Balance : 4000.0
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 3
Enter account number: 2
Enter withdrawal amount: 2100
2100 is withDrawn SuccessFully
Available Balance : 1900.0
Low Balance penalty
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 1
Enter customer name: Ram Sen
Enter account number: <With in 1-5>4
Enter initial balance: 7000
Enter account type (Current/Savings): Savings
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 4
Enter account number: 4
Acoount Holder Name : Ram Sen
Account Number : 4
Account Type : Savings
Available Balance : 7000.0
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 2
Enter account number: 4
Enter deposit amount: 500
500 is Deposited SuccessFully
Available Balance : 7500.0
Intrest Deposited.
Updated Balance 8100.0
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 4
Enter account number: 4
Acoount Holder Name : Ram Sen
Account Number : 4
Account Type : Savings
Available Balance : 8100.0
~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~
Enter your choice: 5
Thanks For using this System:)

 */
