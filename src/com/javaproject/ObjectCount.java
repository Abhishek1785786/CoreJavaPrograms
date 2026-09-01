package com.javaproject;

public class ObjectCount {
	static int count=0;
	{
		count++;
	}
	public static void main(String[] args) {
		ObjectCount Obj1=new ObjectCount();
		ObjectCount Obj2=new ObjectCount();
		ObjectCount Obj3=new ObjectCount();
		ObjectCount Obj4=new ObjectCount();
		System.out.println(count);
	}
}
