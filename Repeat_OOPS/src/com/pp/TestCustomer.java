package com.pp;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Nandita", 10);
		customer.getId();
		customer.getName();
		customer.getDiscount();
		System.out.println(customer);
	}

}
