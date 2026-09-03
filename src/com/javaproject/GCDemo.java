package com.javaproject;

public class GCDemo {
	static void display() {
		GCDemo obj3=new GCDemo();
	}
	protected void finalize() {
        System.out.println("Deleted" );
    }
	public static void main(String[] args) {
		System.out.println("Hello");
//		Nullifying Object
		GCDemo obj1=new GCDemo();
		obj1=null;
//		Re-assigning Objects
		GCDemo obj2=new GCDemo();
		obj2=new GCDemo();
//		Out of Scope
		display();

		System.gc();
		System.out.println("Hello");
	}
}
