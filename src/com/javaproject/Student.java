package com.javaproject;

public class Student {
	
	static String collegeName= "MRU";
	
	int studentId=1;
	String studentName="Abhi";
	int studentMarks=100;
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("College Name: "+collegeName);
		System.out.println("Student Id: "+s.studentId);
		System.out.println("Student Name: "+s.studentName);
		System.out.println("Student Marks: "+s.studentMarks);
	}

}
