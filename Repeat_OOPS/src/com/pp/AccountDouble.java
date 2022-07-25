package com.pp;

import java.util.Arrays;

public class AccountDouble {
private int id;
private Customer customer;
private double balance=0.0;
public AccountDouble(int id, Customer customer, double balance) {
	super();
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public AccountDouble(int id, Customer customer) {
	super();
	this.id = id;
	this.customer = customer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
	public String toString() {
		//return "name= "+name+", id= "+id+", customers=\"+Arrays.toString(customer)+" ";
//return "AccountDouble[name= "+name+", id= "+id+", customer="+Arrays.toString(customer)+"]";
return "AccountDouble[id= "+id+", customer="+customer+"]";
						
}
}
