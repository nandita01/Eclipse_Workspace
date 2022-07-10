package OOPS;
interface First
{
	public void myFirstMet();
}
interface Second
{
	public void mySecondMet();
}
class Third implements First,Second
{
	public void myFirstMet()
	{
		System.out.println("First Interface Method");
	}
	public void mySecondMet()
	{
		System.out.println("Second Interface Method");
	}
}
public class MultipleInterfaceDemo  {

	public static void main(String[] args) {
		Third t=new Third();
		t.myFirstMet();
		t.mySecondMet();
	}

}
