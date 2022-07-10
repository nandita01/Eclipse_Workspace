package inheritanceconcept;

public class Book {
	String name;
	int price;
	
	

	Author auth;
	Book(String n,int p,Author at)
	{
		this.name=n;
		this.price=p;
		this.auth=at;
	}
	public void showDetail()
	{
		System.out.println("Book name is "+name);
		System.out.println("Price is "+price);
		System.out.println("Author details is"+auth.getAuthorName());
	}
	
	

}
