package com.javaproject;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Good Morning!");
		Class.forName("java.lang.String");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("end");
	}

}
