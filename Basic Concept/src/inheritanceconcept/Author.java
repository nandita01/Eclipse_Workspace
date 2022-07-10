package inheritanceconcept;

public class Author {
	String authorName;
	int age;
	String place;
	//CONSTRUCTOR
	Author(String name,int age,String place)
	{
		this.authorName=name;
		this.age=age;
		this.place=place;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public int getage()
	{
		return age;
	}
	public String getplace() 
	{
		return place;
	}
	
}
