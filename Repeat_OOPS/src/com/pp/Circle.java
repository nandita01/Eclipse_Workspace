package com.pp;
import java.lang.*;
public class Circle {
private double radius  = 1.0;
private String color = "red";

 Circle()
{}
Circle(double radius,String color )
{
	this.radius=radius;
	this.color=color;
}
public  double getRadius()
{
	return radius;
}
void setRadius(double radius)
{
	this.radius=radius;
}
public  String getColor()
{
	return color;
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
}
}