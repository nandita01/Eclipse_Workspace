package com.pp;

public class TestAuthor {

	public static void main(String[] args) {
		Author author = new Author("Neha", "neha11@gmail.com", 'f');
		author.getName();
		author.getEmail();
		author.getGender();
		System.out.println(author);
	}

}
