package com.pp;

public class TestAuthor1 {

	public static void main(String[] args) {
		Author1[] authors=new Author1[2];
		authors[0]  =new Author1("neha","neha22@gmail.com",'f');
		authors[1] = new Author1("adwik","ad22@gmail.com",'m');
		
		Book1 book1=new Book1("javabook",authors,464.56,78);
			System.out.println(book1);
			System.out.println(book1.getAuthors());
//			for(Author1 aut:book1.getAuthor())
//			{
//				System.out.println(aut);
//			}

	}

}
