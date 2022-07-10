package start.pp;
public class InheritanceDemo {
	public void m1()
	{
		System.out.println("Parent class method");
	}
}
	class Other extends InheritanceDemo
	{
		public void m2()
		{
			System.out.println("Child class method");
		}
	}

class TestInheritance
{
	public static void main(String[] args) {
		InheritanceDemo i1 = new InheritanceDemo();
		i1.m1();
		
		Other o = new Other();
		o.m1();
		o.m2();
		
		InheritanceDemo i2 = new Other();
		i2.m1();
		
		
//		
		
	}
}
