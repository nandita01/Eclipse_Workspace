package com.pp;

public class MyCircle {
	private MyPoint center;
	private int radius;
	 public MyCircle()  {}
	 public MyCircle(int x,int y,int radius)
	 {
		 center.setX(x);
		 center.setY(y);
		 this.radius=radius;
	 }
	 public MyCircle(MyPoint center,int radius)
	 {
		this.center=center;
		this.radius=radius;
	 }
	 public int getRadius()
	 {
		 return radius;
	 }
	 public void setRadius(int radius)
	 {
		this.radius=radius;
	 }
	 public MyPoint getCenter()
	 {
		 return center;
	 }
	 public void setCenter(MyPoint center)
	 {
		this.center=center;
	 }
	 public int getCenterX()
	 {
		 return center.getX();
	 }
	 public void setCenterX(int x)
	 {
		 center.setX(x);
	 }
	 public int getCenterY()
	 {
		 return center.getY();
	 }
	 public void setCenterY(int Y)
	 {
		 center.setX(Y);
	 }
	 public int[] getCenterXY()
	 {
		 return center.getXY();
	 }
	 public void  setCenterXY(int x,int y)
	 {
		 center.setX(x);
		 center.setY(y);;
	 }
	 @Override
		public String toString() {
			return "MyCircle [center=" + center + ", radius=" + radius + "]";
		}
	 public double getArea()
	 {
		 return Math.PI * radius *radius;
	 }
	 public double getCircumference()
	 {
		 return 2 *(Math.PI * radius);
	 }
	 public double distance(MyCircle another)
	 {
		 return center.distance(another.center);
	 }
	 
	 
	 

}
