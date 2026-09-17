package com.javaproject;

public class Employees {
	int empid;
	String empname;
	int salary;
	
	void display() {
		System.out.println("Employee id : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Salary : "+salary);
		System.out.println();
	}
	public static void main(String[] args) {
		Employees e1=new Employees();
		e1.empid=1;
		e1.empname="Abhi";
		e1.salary=40000;
		e1.display();
		
		Employees e2=new Employees();
		e2.empid=2;
		e2.empname="Shiva";
		e2.salary=30000;
		e2.display();
		
		Employees e3=new Employees();
		e3.empid=3;
		e3.empname="Arjun";
		e3.salary=25000;
		e3.display();
		

	}

}
