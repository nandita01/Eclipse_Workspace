package com.pp;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Nandita", "Rathore", 1000);

//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setFirstName("Nandita"); 
//		employee.setLastName("Rathore");
//		employee.setSalary(500);

		{
			System.out.println("Employee id is: "+employee.getId());
			System.out.println("Employee FirstName is: "+employee.getFirstName());
			System.out.println("Employee LastName is: "+employee.getLastName());
			System.out.println("Employee Name is: "+employee.getName());
			System.out.println("Employee Salary is: "+employee.getSalary());
			System.out.println("Employee AnnualSalary is: "+employee.getAnnualSalary());
			System.out.println("Employee RaiseSalary is: "+employee.raiseSalary(10));
			System.out.println("Employee AnnualSalary is: "+employee.getAnnualSalary());

		}

	}

}
