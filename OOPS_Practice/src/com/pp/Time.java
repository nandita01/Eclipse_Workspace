package com.pp;

public class Time {
	private int hour;
	private int minute;
	private int second;
	Time(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	void setHour(int hour)
	{
		this.hour=hour;
	}
	void setMinute(int minute)
	{
		this.minute=minute;
	}
	void setSecond(int second)
	{
		this.second=second;
	}
	void setTime(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	
	
	@Override
	public String toString() {
		String hour= String.format("%02d",this.getHour());
		String minute= String.format("%02d",this.getMinute());
		return "[" +hour+  ": "+minute+" : "+second+ "]";
		
	}
	public int  nextSecond(int time)
	{
		second=second+1;
		return time;
	}
	public int  previousSecond(int time)
	{
		second=second-1;
		return time;
	}
	
	
}
