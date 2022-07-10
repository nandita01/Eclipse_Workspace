package com.pp;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee(1,"Neha","Rathore",1000);
		System.out.println(e.getId());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getAnnualSalary());
		System.out.println(e.raiseSalary(10));
		e.setSalary(2000);
		System.out.println(e.getAnnualSalary());
		System.out.println(e.raiseSalary(10));
		

	}

}
