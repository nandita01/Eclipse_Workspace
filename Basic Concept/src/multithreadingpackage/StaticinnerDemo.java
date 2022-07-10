package multithreadingpackage;

public class StaticinnerDemo {
	
		static class MyStatic
		{
			public static void main(String[] args)
			{
				System.out.println("Static class main method");
			}
		}
		public static void main(String[] args) 
		{
			System.out.println("Outer class main method");
		}

	}

