package ExceptionHandling;

public class PrintMethodsExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Three types of  methods to print");
		System.out.println("1. printStackTrace");
		System.out.println("2. ae.toString");
		System.out.println("3. ae.getMessage");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		/*catch(ArithmeticException ae)
		{
			//System.out.println(ae.toString());
			System.out.println(ae);
		}*/
		/*catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}*/
	}

}
