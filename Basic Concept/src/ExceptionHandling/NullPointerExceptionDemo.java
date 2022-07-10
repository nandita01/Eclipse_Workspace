package ExceptionHandling;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		/*String str=null;
		System.out.println(str.length());*/
		/*String str = "nandita";
		System.out.println(str.length());*/
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("We are getting error");
		}
		System.out.println("Rest of code");
		
	}

}
