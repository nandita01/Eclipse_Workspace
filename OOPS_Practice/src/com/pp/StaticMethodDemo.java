package com.pp;

public class StaticMethodDemo {
	public static void m1()
	{
		System.out.println("Static method ");
	}
}
	class PreStatic extends StaticMethodDemo
	{
		public  static void m1()
		{
			System.out.println("Child method");
		}
	}
	class StaticTest
	{
		public static void main(String[] args) {
//			StaticMethodDemo s = new StaticMethodDemo();
//			s.m1();
//			 PreStatic p = new PreStatic();
//			 p.m1();
			StaticMethodDemo.m1();
			PreStatic.m1();
			 
		}
	}


