package com.app;

import java.util.Scanner;

public class Banking_App {
	
	
	public static void main(String[] args) {
		
		System.out.println("=============Banking Console Application Here=================");
		
		Scanner sc = new Scanner(System.in);
		
		double balance=1000.00;
		
		int attempts=0;
		
		int pin= 1212;
		
		String wantToContinue = "Yes";
		
		boolean isLogined=false;
		
		int bankId=0;
		
		String name="";
		
		String account="";
		
		do {
			
			if(!isLogined)
			{
				System.out.println("Login Here......");
				
				System.out.println("Enter Your Pin.........");
				
				int userpin = sc.nextInt();
				
				if(userpin==pin)
				{
					isLogined=true;
					System.out.println("Welcome To Bnaking App Here");
					System.out.println("Your pin is correct welcome!!!!!!!!!");
					
					System.out.println("Enter BankId Here = ");
					bankId=sc.nextInt();
					
					System.out.println("Enter Name Here = ");
					name=sc.next();
					
					System.out.println("Enter Account Here = ");
				    account=sc.next();
				    
				    
				}
				else
				{
					attempts++;
					System.out.println("Sorry Your Pin Is Incorrect Plz Try Again Attempts Left = "+(3-attempts));
					
					if(attempts==3)
					{
						System.out.println("Your card is block due to Invalid attemts odf Pin Here Sorry!!!!!!!");
						break;
					}
					continue;
				}
				
				
				
				
			}
			
			System.out.println("Enter Option here");
			
			System.out.println("1. Deposite");
			
			System.out.println("2. WithDraw");
			
			System.out.println("3. Check balance");
			
			System.out.println("4. Exit");
			
			System.out.println("Enter Choice Here");
			
			int choice = sc.nextInt();
			
			int amount=0;
			
			if(choice==1)
			{
				System.out.println("Enter Amount Here....");
				
				amount=sc.nextInt();
				
				if(amount>0)
				{
					balance=balance+amount;
					  
					System.out.println("Depsoited After balance = "+balance);
					printDetails(bankId, name, account, amount, balance);
				}
				else
				{
					System.out.println("Money not deposited here......");
				}
			}
			else if(choice==2)
			{
				
               System.out.println("Enter Amount Here....");
				
				amount=sc.nextInt();
				
				if(amount>0)
				{
					if(amount<=balance)
					{
						balance=balance-amount;
						System.out.println("WithDraw Money here = "+balance);
						printDetails(bankId, name, account, amount, balance);
					}
					else
					{
						System.out.println("Money is not withdraw here sorry");
					}
				}
				else
				{
					System.out.println("Insufficient Balance Here");
				}
				
				
			}
			else if(choice==3)
			{
				System.out.println("Check current Balance Here....."+balance);
				
				printDetails(bankId, name, account, 0, balance);
			}
			else if(choice==4)
			{
				System.out.println("Exit Here........");
				break;
			}
			else
			{
				System.out.println("Invalid Choice Here Sorry..........");
			}
			
			System.out.println("Do You Want To Continue Say (Yes/No)");
			
			wantToContinue=sc.next();
			
			if(wantToContinue.equalsIgnoreCase("No"))
			{
				break;
			}
			
			
		} while (wantToContinue.equalsIgnoreCase("Yes"));
	}
	
	public static void printDetails(int bankId, String name,String account, int amount,double balance)
	{
		System.out.println("======Acount Info Here========");
		
		System.out.println("BankId = "+bankId);
		
		System.out.println("name = "+name);
		
		System.out.println("Account = "+account);
		
		if(amount>0)
		{
			System.out.println("Amount = "+amount);
		}
		
		System.out.println("Balance= "+balance);
	}
}


