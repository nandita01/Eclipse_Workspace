package inheritanceconcept;

public class Job
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
