package com.pp;

public class TestTime {

	public static void main(String[] args) {
		Time time = new Time(4, 23, 52);
		time.getHour();
		time.getMinute();
		time.getSecond();
		System.out.println(time);
	}

}
