package com.javaproject;

public class BankAccount {
	int Accno;
	String accountHolderName;
	int balance;
	
	static int accountNoGenerate=23456789;
	{
		accountNoGenerate++;
	}
	
	void display() {
		System.out.println("Account No: "+Accno);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println();
	}
	public static void main(String[] args) {
		BankAccount obj1=new BankAccount();
		obj1.Accno=accountNoGenerate;
		obj1.accountHolderName="Abhi";
		obj1.balance=30000;
		obj1.display();
		
		BankAccount obj2=new BankAccount();
		obj2.Accno=accountNoGenerate;
		obj2.accountHolderName="Siddhu";
		obj2.balance=50000;
		obj2.display();
		
		BankAccount obj3=new BankAccount();
		obj3.Accno=accountNoGenerate;
		obj3.accountHolderName="Arjun";
		obj3.balance=20000;
		obj3.display();

	}

}
