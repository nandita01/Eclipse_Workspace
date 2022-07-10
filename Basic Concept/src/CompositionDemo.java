  class Job
{
	private String Role;
	private long Salary;
	private int Id;
	// SETTER AND GETTER METHOD
	
	public String getRole()
	{
		return Role;
	}
	public long getSalary()
	{
		return Salary;
	}
	public int getId()
	{
		return  Id;
	}
	public void setRole(String Role)
	{
		this.Role=Role;
	}
	public void setSalary(long Salary)
	{
		this.Salary=Salary;
	}
	public void setId(int Id)
	{
		this.Id=Id;
	}
}
	
  class Person1

	{
		 Job job;
		public Person1()
		{
			 this.job=new Job();
			job.setSalary(5000);
		}
		public long getSalary()
		{
			return job.getSalary();
		}
	}
  
	public class CompositionDemo
	{
		public static void main(String[] args) {
			Person1 person=new Person1();
			long Salary= person.getSalary();
		 System.out.println("Salary is:" +Salary);
		}
	}



