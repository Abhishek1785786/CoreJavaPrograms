package com.javaproject;

public class Test1 {
		static  void method4(){
			System.out.println("Static method1 called");
		}
		static void method3(){
			method4();
			System.out.println("Static method2 called");
		}
		void method2(){
			method3();
			System.out.println("Instance method1 called");
		}
		void method1(){
			method2();
			System.out.println("Instance method1 called");
		}
		public static void main(String[] args) {
			Test1 o=new Test1();
			o.method1();
		}
}
