package com.pp;

public class Date {
private int day;
private int month;
private int year;
public Date(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void setDate(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
	}
@Override
	public String toString() {
	String day= String.format("%02d",this.getDay());
	String month= String.format("%02d",this.getMonth());
	return "Date["+day+"/"+month+"/"+year+"]";
	}
}
