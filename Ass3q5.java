/**
 * 
 */
package javaAssignment4And3;

import java.util.Scanner;

/**
 *  Define a class Account to represent a bank account. Include the following members.
	Instance Variable: Name of the depositor, Account number, Account type, Balance amount in
	the account.
	
	Method: To assign initial values, To deposit an amount, To withdraw an amount after checking
	the balance, To display name and balance.
	
	Write a program to test the program for a given number of customers. The program should be
	able to search any customer if the account number is provided.
 */

class Account{
	

	private String depositor;
	private int accountNumber;
	private String acoountType;
	private int balance;
	
	Account(){
		
	}
	
	Account(String depositor,int accountNumber,String acoountType,int balance){
		this.depositor = depositor;
		this.accountNumber = accountNumber;
		this.acoountType = acoountType;
		this.balance = balance;
	}
	
	protected String getDepositor() {
		return depositor;
	}


	protected int getAccountNumber() {
		return accountNumber;
	}


	protected String getAcoountType() {
		return acoountType;
	}

	
	protected int getBalance() {
		return balance;
	}
	
	
	private boolean validAccountNumber(int accountNumber) {
		return this.accountNumber == accountNumber;
	}
	
	public boolean depositeAmount(int accountNumber , int amount) {
		if(validAccountNumber(accountNumber)) {
			this.balance += amount;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean withdrawAmount(int accountNumber , int amount) {
		if(validAccountNumber(accountNumber)) {
			if(this.balance>= amount) {
				this.balance -=amount;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Account Details \n Account Holder Name = " + this.depositor + "\n Account Number = " + this.accountNumber + "\n Acoount Type = " + this.acoountType
				+ "\n Balance=" + this.balance;
	}
}
public class Ass3q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Account ayan = new Account("Ayan",1234,"savings",566);
//		System.out.println(ayan.depositeAmount(1234, 456));
//		System.out.println(ayan.getBalance());
//		System.out.println(ayan.withdrawAmount(1234, 4560));
//		System.out.println(ayan.getBalance());
		int totalNumberOfAccount = 210;
		Account accountDetails[] = new Account[totalNumberOfAccount];
//		accountDetails[0] = new Account("Ayan",1234,"savings",566);
		
		int ch1, ch2, ch3 = 0, acNumber, depositedAmount, withDrawnAmount, flag;
		String actName, actType = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!! This system is made by Ayan Saha");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while(true) {
			System.out.println("MAIN MENU~>");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Press Here if you have an Account");
			System.out.println("2. Press Here if you don't have an Account");
			System.out.println("3. for Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Please Enter Your Choice: ");
			ch1 = sc.nextInt();
			System.out.println("------------------------------");
			
			outerSwitch:
			switch (ch1) {
			
			case 1: 
				// if you have an Account
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("1. Press Here For Deposit");
				System.out.println("2. Press Here For WithDraw");
				System.out.println("3. For go to Main Menu");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Please Enter Your Choice: ");
				ch2 = sc.nextInt();
				System.out.println("------------------------------");
				
				switch(ch2) {
				
				case 1 :
					//For Deposit
					flag = 0;
					System.out.print("Please Enter Your Account Number: ");
					acNumber = sc.nextInt();
					System.out.print("Please Enter Your amount you want to Deposite: ");
					depositedAmount = sc.nextInt();
					System.out.println(depositedAmount);
					if(accountDetails[acNumber].depositeAmount(acNumber, depositedAmount)) {
						
						// valid user
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Hello "+accountDetails[acNumber].getDepositor());
						System.out.println("Your amount "+ depositedAmount + " is deposited successfully");
						System.out.println("Your Available balance is : " + accountDetails[acNumber].getBalance());
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println();
						break outerSwitch;
					}else {
						// if flag >0 then the account doesn't exists
						flag++;
					}
					
					if(flag>0) {
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Your Account Number is Wrong");
					}
					break outerSwitch;
					
				case 2 :
					// For WithDraw
					acNumber=0;
					flag=0;
					System.out.print("Please Enter Your Account Number: ");
					acNumber = sc.nextInt();
					System.out.print("Please Enter Your amount you want to WithDraw: ");
					withDrawnAmount = sc.nextInt();
					
					if(accountDetails[acNumber].withdrawAmount(acNumber, withDrawnAmount)) {
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Hello "+accountDetails[acNumber].getDepositor());
						System.out.println("Your amount "+ withDrawnAmount + " has been WithDrawn successfully");
						System.out.println("Your Available balance is : " + accountDetails[acNumber].getBalance());
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println();
						break outerSwitch;
					}
					
					System.out.println("~~~~~~~~~~~~~~~~~~~");
					System.out.println("Invalid Credentials ");
					System.out.println("Try agian...");
					System.out.println("~~~~~~~~~~~~~~~~~~~");
					break outerSwitch; 
					
				case 3 : break outerSwitch;
				default: System.out.println("You Enter a wrong choice");
				}
					
			case 2: 
				//if you don't have an Account
				
				sc.nextLine();
				System.out.print("Enter Your Name : ");
				actName = sc.nextLine();
				
				// A AutoGenerated Account Number 100-200
				acNumber = (int)(Math.random()*(200-100+1)+100);
				
				// Getting Input the Account Type
				System.out.println("1. Press Here For Savings Account");
				System.out.println("2. Press Here For Current Account");
				System.out.print("Please Enter Your Choice: ");
				ch3 = sc.nextInt();
				switch(ch3) {
				
				case 1:
					actType = "Savings Account";
					
					break;
				
				case 2:
					actType = "Current Account";
					break;
				}
				
				accountDetails[acNumber] = new Account(actName,acNumber,actType,0);
				
				System.out.println("##############################");
				System.out.println("Please Note Down Your Account Details..");
				System.out.println(accountDetails[acNumber]);
				System.out.println("##############################");
				
				break;
			
			case 3: sc.close();
					System.out.println("Thanks For using this system...");
					System.out.println("Exiting... :-)");
					System.exit(0);
					
			default: System.out.println("You Enter a wrong choice");
			}
			
		}
	}

}

/*
Output->
Welcome!! This system is made by Ayan Saha
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
Enter Your Name : Ayan Saha
1. Press Here For Savings Account
2. Press Here For Current Account
Please Enter Your Choice: 2
##############################
Please Note Down Your Account Details..
Account Details 
 Account Holder Name = Ayan Saha
 Account Number = 126
 Acoount Type = Current Account
 Balance=0
##############################
MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
Enter Your Name : Ram Das
1. Press Here For Savings Account
2. Press Here For Current Account
Please Enter Your Choice: 1
##############################
Please Note Down Your Account Details..
Account Details 
 Account Holder Name = Ram Das
 Account Number = 154
 Acoount Type = Savings Account
 Balance=0
##############################
MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here For Deposit
2. Press Here For WithDraw
3. For go to Main Menu
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Please Enter Your Account Number: 154
Please Enter Your amount you want to Deposite: 9000
9000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hello Ram Das
Your amount 9000 is deposited successfully
Your Available balance is : 9000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here For Deposit
2. Press Here For WithDraw
3. For go to Main Menu
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
Please Enter Your Account Number: 126
Please Enter Your amount you want to Deposite: 6000
6000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hello Ayan Saha
Your amount 6000 is deposited successfully
Your Available balance is : 6000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
1
------------------------------
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here For Deposit
2. Press Here For WithDraw
3. For go to Main Menu
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
2
------------------------------
Please Enter Your Account Number: 126
Please Enter Your amount you want to WithDraw: 500
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hello Ayan Saha
Your amount 500 has been WithDrawn successfully
Your Available balance is : 5500
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

MAIN MENU~>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Press Here if you have an Account
2. Press Here if you don't have an Account
3. for Exit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Please Enter Your Choice: 
3
------------------------------
Thanks For using this system...
Exiting... :-)

*/
