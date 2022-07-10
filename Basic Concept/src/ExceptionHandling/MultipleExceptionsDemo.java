package ExceptionHandling;

public class MultipleExceptionsDemo {

	public static void main(String[] args) {
		try {
		int[] a= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array Exception Handle");
		}
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception handle");
		}
		/*try
		{
		String str=null;
		System.out.println(str.length());
		}
		catch(NullPointerException)
		{
			System.out.println("String exception handle");
		}*/
	}

}
