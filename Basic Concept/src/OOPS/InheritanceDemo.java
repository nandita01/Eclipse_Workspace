package OOPS;
class Color
{
	public void red()
	{
		System.out.println("Red specified property from Parent");
	}
}
class Fruit extends Color
{
	public void apple()
	{
		System.out.println("Apple specified from child");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
//		Color c=new Color();
//		c.red();
//		c.apple();
		
//		Fruit f=new Fruit();
//		f.apple();
//		f.red();
		
		Color c1=new Fruit();
		c1.red();
		//c1.apple();
		
		//CE:Fruit f1=new Color();
	

	}

}
