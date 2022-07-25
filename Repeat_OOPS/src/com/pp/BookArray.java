package com.pp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookArray {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;	
	
	public BookArray(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author[] getAuthor() {
		return authors;
	}
	 public List<Author>getAuthors()
     {
    	 List<Author> auth= new ArrayList<>();
    	 for(Author authors:authors)
    	 {
    		 auth.add(authors);
    	 }
    	 return auth;
     }
	public void setAuthores(Author[] authores) {
		this.authors = authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		 return "Book[name= "+name+", authors="+Arrays.toString(authors)+",price= "+price+", qty= "+qty+"]";
	}
	public String getAuthorNames() {
		return "authorName1,authorName2";
	}
}

