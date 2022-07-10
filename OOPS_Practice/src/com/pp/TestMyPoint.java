package com.pp;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint mypoint1=new MyPoint();
		System.out.println(mypoint1);
		mypoint1.setX(8); // Test setters
		mypoint1.setY(6);
		System.out.println("x is: " + mypoint1.getX()); // Test getters
		System.out.println("y is: " + mypoint1.getY());
		mypoint1.setXY(3, 0); // Test setXY()
		System.out.println(mypoint1.getXY()[0]); // Test getXY()
		System.out.println(mypoint1.getXY()[1]);
		//System.out.println(mypoint1);
		
		MyPoint mypoint2=new MyPoint();
		System.out.println(mypoint2);
		mypoint2.setX(2); // Test setters
		mypoint2.setY(6);
		System.out.println("x is: " + mypoint2.getX()); // Test getters
		System.out.println("y is: " + mypoint2.getY());
		mypoint2.setXY(7, 2); // Test setXY()
		System.out.println(mypoint2.getXY()[0]); // Test getXY()
		System.out.println(mypoint2.getXY()[1]);
	}
}
