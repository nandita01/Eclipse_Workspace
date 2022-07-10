package inheritanceconcept;

public class Person 
{
	private Job job;
	public Person()
	{
		 this.job=new Job();
		job.setSalary(5000);
	}
	public long getSalary()
	{
		return job.getSalary();
	}

}
