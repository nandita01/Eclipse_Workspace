package com.pp;

public class TestMyCircle {
public static void main(String[] args) {
	MyPoint mp = new MyPoint(5,3);
	
	MyCircle mycircle1 = new MyCircle(); //1
	MyCircle mycircle2 = new MyCircle(4,5,7); //2
	MyCircle mycircle3 = new MyCircle(mp,78);
	
	System.out.println(mycircle3);
	
}
}
