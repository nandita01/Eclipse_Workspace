package com.pp;

public class TestAccount {

	public static void main(String[] args) {
//		Account account=new Account("2", "Neha",3000);
//		System.out.println(account.getId());
//		System.out.println(account.getName());
//		System.out.println(account.getBalance());
//		System.out.println(account.credit(200));
//		System.out.println(account.debit(4000));
//		//System.out.println(account.transferTo(4000));
		
		Account account_karan = new Account("101", "karan", 16799);
		Account account_nandita = new Account("101", "nandita", 3000);
		
		System.out.println(account_karan.getBalance());
		System.out.println(account_nandita.getBalance());
		
		account_karan.transferTo(account_nandita, 8500); // yha account_karan caller object ohai ok aa gya??
		
		System.out.println("after transfer amount**************");
		
		System.out.println(account_karan.getBalance());
		System.out.println(account_nandita.getBalance());
		
		System.out.println(account_karan);
		System.out.println(account_nandita);

		
		

	}

}
