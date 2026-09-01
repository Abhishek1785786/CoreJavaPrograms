package com.javaproject;

public class Institute {

	static String TrainerName1="Srikanth";
	static String TrainerName2="Vishwanath";
	
	int Empid;
	String EmpName;
	String EmpDesignation;
	void display() {
		System.out.println("Trainer Name 1: "+TrainerName1);
		System.out.println("Trainer Name 2: "+TrainerName2);
		System.out.println("Employee Id: "+Empid);
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee Designation: "+EmpDesignation);
	}
	public static void main(String[] args) {
		Institute t=new Institute();
		t.Empid=1;
		t.EmpName="Abhi";
		t.EmpDesignation="Analyst";
		
		Institute i=new Institute();
		i.Empid=2;
		i.EmpName="Ram";
		i.EmpDesignation="Salesman";
		
		Institute v=new Institute();
		v.Empid=3;
		v.EmpName="Siddhu";
		v.EmpDesignation="Clerk";
		
		Institute c=new Institute();
		c.Empid=4;
		c.EmpName="Shiva";
		c.EmpDesignation="Salesman";
		
		Institute s=new Institute();
		s.Empid=5;
		s.EmpName="Rahul";
		s.EmpDesignation="Salesman";
		
		t.display();
		i.display();
		v.display();
		c.display();
		s.display();
		
		
	}

}
