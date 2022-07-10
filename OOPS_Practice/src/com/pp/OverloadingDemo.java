package com.pp;

public class OverloadingDemo {
	public void m1()
	{
		System.out.println("No arguement method");
	}
	public void m1(int i)
	{
		System.out.println("Integer arguement method");
	}
	public void m1(double i)
	{
		System.out.println("Double arguement method");
	}
	public void m1(int i, float f)
	{
		System.out.println("Int float method");
	}
	public void m1(float f, int i)
	{
		System.out.println("FLoat int method");
	}
	
	public static void main(String[] args) {
		OverloadingDemo o = new OverloadingDemo();
		o.m1();
		o.m1(10);
		o.m1(80.8);
		o.m1(12,6.7f);
		o.m1(12f,6);
		
	}

}
