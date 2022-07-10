package com.pp;

public class Rectangle {
	private float length=1.0f;
	private float width=1.0f;
	Rectangle() {   }
	Rectangle(float length, float width)
	{
		this.length=length;
		this.width=width;
	}
	public float getLength()
	{
		return length;
	}
	void setLength()
	{
		length=4.9f;
	}
	public float getWidth()
	{
		return width;
	}
	void setWidth()
	{
		width=5.4f;
	}
	double getArea()
	{
		return width*length;
	}
	double getPerimeter() 
	{
		return 2*(length+width);
	}
	@Override
	public String toString() {

		return "Rectangle[ length=" + length + ", width=" + width + "]";
	}
}
 
