package com.javaproject;

public class TestMethods {
	private static final int result = 0;

	public void add(int a, int b) {
		int result=a+b;
		System.out.println("Addition : "+result);
		sub(result,5);
	}

	public void sub(int a, int b) {
		System.out.println("Subtraction : "+ (a-b));
		multiply(a-b,2);
	}

	public void multiply(int a, int b) {
		System.out.println("Multiplication : "+(a*b));
		div(a*b,4);
	}

	public void div(int a, int b) {
		System.out.println("Division : "+(a/b));

	}

	public static void main(String[] args) {
		TestMethods tm=new TestMethods();
		tm.add(10,5);
		
	}

}
