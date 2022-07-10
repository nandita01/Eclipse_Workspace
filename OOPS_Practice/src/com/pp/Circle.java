package com.pp;

public class Circle {
	private double radius=1.0;
	private String color="red";	

	Circle () {  }
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color)
	{
		this.color=color;
	}
	public  double getRadius()
	{
		return radius;
	}
	public String getColor()
	{
		return color;
	}
	void setRadius(double radius)
	{
		this.radius=radius;
	}
	void  setColor(String color)
	{
		this.color=color;
	}
	@Override
	public String toString() {
		return radius+ " " +color;
	}

	public double getArea()
	{
		return Math.PI*radius*radius;
		//return 3.14*radius*radius;
	} 
}





