package com.javaproject;

public class Employee {
	int empid;
	int age;
	int salary;
	char grade;
	int yoe;
	boolean active;
	int nol;
	long phone;
	
	void display() {
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee age : "+age);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee grade : "+grade);
		System.out.println("Year of Experience : "+yoe);
		System.out.println("Employee is active : "+active);
		System.out.println("Number of leaves : "+nol);
		System.out.println("Employee phone : "+phone);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.empid=1;
		e.age=30;
		e.salary=40000;
		e.grade='B';
		e.yoe=5;
		e.active=true;
		e.nol=2;
		e.phone=9785452626L;
		e.display();

	}

}
