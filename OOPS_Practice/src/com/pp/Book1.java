package com.pp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book1 {
	private String name;
    private  Author1[] authors;
	private double price;
	private int qty=0;
	
	Book1(String  name,Author1[] authors,double  price,int  qty)
	{
		this.name=name;
     	this.authors =authors;
		this.price=price;
		this.qty=qty;
	}
		public String getName()
	{
		return name;
	}
     public Author1[] getAuthor()
	{		
    	 return authors;
	}
     public List<Author1>getAuthors()
     {
    	 List<Author1> auth= new ArrayList<>();
    	 for(Author1 authors:authors)
    	 {
    		 auth.add(authors);
    	 }
    	 return auth;
     }
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	@Override
	public String toString() {
	 return "Book[name= "+name+", authors="+Arrays.toString(authors)+",price= "+price+", qty= "+qty+"]";
	}
}
