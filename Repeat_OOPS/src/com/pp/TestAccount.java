package com.pp;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("1", "Jaha", 19000);
		System.out.println("Id is: "+account.getId());
		System.out.println("Name is: "+account.getName());
		System.out.println("Balance is: "+account.getBalance());
		System.out.println("Credit Amount: "+account.credit(1000));
		System.out.println("Debit Amount: "+account.debit(5000));
		Account account_jaha = new Account("101", "jaha", 10000);
		Account account_nandita = new Account("101", "nandita", 3000);
		
		System.out.println("Jaha Balance is: "+account_jaha.getBalance());
		System.out.println("Nandita Balance is: "+account_nandita.getBalance());
		
		account_jaha.transferTo(account_nandita, 1000); 
		
		System.out.println("after transfer amount**************");
		
		System.out.println("Jaha Balance is: "+account_jaha.getBalance());
		System.out.println("Nandita Balance is: "+account_nandita.getBalance());
		
		System.out.println(account_jaha);
		System.out.println(account_nandita);

	}

}
