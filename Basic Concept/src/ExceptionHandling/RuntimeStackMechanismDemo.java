package ExceptionHandling;

public class RuntimeStackMechanismDemo {

	public static void main(String[] args) {
		 doStuff();
		}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println("Hello");
	}
}
