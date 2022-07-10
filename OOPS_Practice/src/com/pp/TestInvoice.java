package com.pp;

public class TestInvoice {

	public static void main(String[] args) {
		InvoiceItem i=new InvoiceItem("101", "Hello world", 500, 5);
		System.out.println(i.getId());
		System.out.println(i.getDesc());
		System.out.println(i.getQty());
		System.out.println(i.getUnitPrice());
		System.out.println(i.getTotal());

	}

}
