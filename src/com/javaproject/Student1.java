package com.javaproject;

public class Student1 {
	String name;
	int age;
	String college;
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("College :"+college);
		System.out.println();
	}

	public static void main(String[] args) {
		Student1 O1=new Student1();
		O1.name="Abhi";
		O1.age=22;
		O1.college="MRU";
		O1.display();
		
		Student1 O2=new Student1();
		O2.name="Balu";
		O2.age=22;
		O2.college="MRU";
		O2.display();

	}

}
