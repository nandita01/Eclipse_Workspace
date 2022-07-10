package ExceptionHandling;

public class ArrayException {
	public static void main(String[] args) {
		System.out.println("Creating an array");
		try
		{
			int[] a={10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We are getting Exception");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("We are getting Exception");	
		}*/
		System.out.println("rest of code");
		
	}

}
