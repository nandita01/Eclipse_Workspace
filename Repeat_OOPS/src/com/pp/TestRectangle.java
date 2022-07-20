package com.pp;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("length is: "+rectangle.getLength());
		System.out.println("Width is: "+rectangle.getWidth());
		System.out.println("Area of Rectangle: "+rectangle.getArea());
		System.out.println("Area of Perimeter: "+rectangle.getPerimeter());
	}

}
