abstract class Animal
{
	public abstract void m1();
	public  void m2()
	{
		System.out.println("normal method");
	}
}
class Dog extends Animal
{
	public void m1()
	{
		System.out.println("initialize abstract method");
	}
}


public class AbstractDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.m1();
		d.m2();

		
	}
	
}
