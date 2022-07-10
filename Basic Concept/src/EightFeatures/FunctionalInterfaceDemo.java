package EightFeatures;
 interface MyFunctionalInteerface{
	void print();
	
	default void m1()
	{
		System.out.println("Default method called");
	}
	static void m2()
	{
		System.out.println("Static method called");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		System.out.println("hello");
		
		
	}

}
