package com.pp;

public class TestInvoice {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Nandita", 10);
		Invoice invoice = new Invoice(10, customer, 12.30);
		System.out.println(invoice);
	}

}
