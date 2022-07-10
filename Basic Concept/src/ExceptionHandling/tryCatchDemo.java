package ExceptionHandling;

	public class tryCatchDemo {

	public static void main(String[] args) {
	System.out.println("Nandita Rathore");
	System.out.println("Java Developer");
	try
	{
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("get Arithmatic Exception"+e);
	}
	}

}

