package com.javaproject;

public class Test {
	static {
		System.out.println("Static method1 called");
	}
	static {
		System.out.println("Static method2 called");
	}
	{
		System.out.println("Instance method1 called");
	}
	{
		System.out.println("Instance method2 called");
	}
	public static void main(String[] args) {
		Test o=new Test();
		

	}

}
