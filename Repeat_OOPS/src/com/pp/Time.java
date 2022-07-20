package com.pp;

public class Time {
private int hour;
private int minute;
private int second;
public Time(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second=second;
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
public  void setTime(int hour,int minute, int second) {
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
@Override
	public String toString() {
		String hour=String.format("%02d",this.getHour());
		String minute=String.format("%02d",this.getMinute());
		String second=String.format("%02d",this.getSecond());
		return "Time["+hour+":"+minute+":"+second+"]";
}
	public int nextSecond(int time) {
	second = second+1;
	return time;
}
	public int previousSecond(int time) {
		second = second-1;
		return time;
	}





}
