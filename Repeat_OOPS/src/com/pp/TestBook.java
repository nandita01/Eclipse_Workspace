package com.pp;

public class TestBook {

	public static void main(String[] args) {
		Author author=new Author("Jaha","jaha1121@gmail.com",'f');
		Book book=new Book("Java",author,80.88,20);
	                System.out.println(book);
	}

}
