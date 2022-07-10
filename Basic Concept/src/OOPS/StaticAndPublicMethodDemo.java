package OOPS;
public class StaticAndPublicMethodDemo 
{
	static  void myStaticMet()
	{
		System.out.println("Static method called without creating an object");
	}
	public void myPublicMet()
	{
		System.out.println("Public method called by creating class object"); 
	}

	public static void main(String[] args) {
		myStaticMet();
		StaticAndPublicMethodDemo  m= new StaticAndPublicMethodDemo ();
		m.myPublicMet();
	}
}
