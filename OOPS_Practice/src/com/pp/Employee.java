package com.pp;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	Employee(int id,String firstName, String lastName, int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}	
		public int getId()
		{
			return id;
		}
		public String getFirstName()
		{
			return firstName;
		}
		public String getLastName()
		{
			return lastName;
		}
		public String getName()
		{
			return firstName+ " " +lastName;
		}
		public int getSalary()
		{
			
			return salary;
		}
		void setSalary(int salary)
		{
			this.salary=salary;
		}
		public int getAnnualSalary()
		{
			return salary*12;
		}
		public int raiseSalary(int percent)
		{
			return salary+(salary/100*percent);
		}
		@Override
		public String toString() {
			return "Employee[id=" + id + ", name= " + firstName+ lastName +  ",salary= " + salary + "]";
		}
}
