package com.pp;

public class Rectangle {
private float length=1f;
private float width=1f;
Rectangle(){
	System.out.println("Default Constructer");
	}
Rectangle(float length, float width ){
	this.length=length;
	this.width=width;
}
public float getLength() {
	return length;
}
public void setLength() {
	this.length=length;
}
public float getWidth() {
	return width;
}
public void setWidth() {
	this.width=width;
}
public double getArea() {
	return length*width;
}
public double getPerimeter() {
	return 2*(length+width);
}
@Override
	public String toString() {
	return length+ " " +width;
	}
}
