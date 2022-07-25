package com.pp;

public class TestBookArray {

	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0]  =new Author("neha","neha22@gmail.com",'f');
		authors[1]  =new Author("adwik","adik@gmail.com",'m');
		BookArray bk = new BookArray("Android", authors ,  12.60, 20);
		System.out.println(bk);
		System.out.println(bk.getAuthors());
	}

}
