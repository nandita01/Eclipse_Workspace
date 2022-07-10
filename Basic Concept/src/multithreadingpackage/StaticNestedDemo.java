package multithreadingpackage;

public class StaticNestedDemo {
	static class MyNested
	{
		public void m1()
		{
			System.out.println("Static Inner class method ");
		}
		
	}

	public static void main(String[] args) {
		MyNested n=new MyNested();
		n.m1();

	}

}

