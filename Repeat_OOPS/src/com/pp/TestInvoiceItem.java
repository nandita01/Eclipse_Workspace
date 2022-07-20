package com.pp;

public class TestInvoiceItem {

	public static void main(String[] args) {
     InvoiceItem i = new InvoiceItem("1", "Indore", 10,2.0 );
     System.out.println("Id is: " +i.getId());
     System.out.println("Desc is: " +i.getDesc());
     System.out.println("Quantity is: " +i.getQty());
     System.out.println("UnitPrice is: " +i.getUnitPrice());
     System.out.println("Total is: " +i.getTotal());
	}

}
