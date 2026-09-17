package com.javaproject;

public class User {
	int balance=100;
	int cost=7;
	public static void main(String[] args) {
		User u=new User();
		System.out.println(u.balance/u.cost);
		System.out.println(u.balance%u.cost);

	}

}
