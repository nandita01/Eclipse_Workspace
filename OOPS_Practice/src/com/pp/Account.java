package com.pp;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	Account(String id, String name)
	{
		this.id=id;
		this.name=name;
	}
	Account(String id, String name, int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	public int credit(int amount)
	{
		balance = balance + amount;
		return balance;
	}
	public int debit(int amount)
	{
		if(amount <= balance)
				  balance = balance - amount;
		else
			System.out.println("Amount exceeded balance");
		return balance;
		
	}
	public int transferTo(Account account,int amount)
	{
		if(amount <= this.balance) {
			this.debit(amount);        
			account.credit(amount); // ni smj AAyi ab aa gya na yeh wali line ni aayi 
			// ye account vha se pass kiya hua h vo wala hai. tera account usme amount credit kiya h ok
			// itta dimag lgana tha ki ek k account se debit hoga aur dusre me credit
			// mene search kiya hua k dekh phli tab close kr di aa gya ab but vo  aa gya pkkaha ab analize krugi ee to aa gya
		}	
		
		else
			System.out.println("Amount exceeded balance");
		return balance;
	}
	@Override
	public String toString() {
		
		return "Account[id= "+id+", name= "+name+", balance= "+balance+"]";
	}

	
}
