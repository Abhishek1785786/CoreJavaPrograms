package com.javaproject;

public class GCDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello");
//		Nullifying Object
		GCDemo obj1=new GCDemo();
		obj1=null;
//		Re-assigning Objects
		GCDemo obj2=new GCDemo();
		obj2=new GCDemo();
		
		System.gc();
		System.out.println("Hello");
	}
}
