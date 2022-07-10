import java.io.*;
public class constructorException
{
	constructorException() throws IOException
	{

	}

	class C extends constructorException
	{
		C() throws IOException 
		{
			super(); 
			System.out.println("Nandita Rathore");


		}
	}
	public static void main(String[] args) 
	{

	}
}	



