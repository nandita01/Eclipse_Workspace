package multithreadingpackage;

class InterrupTest extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("i am lazy");
				Thread.sleep(200);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("I got Interrupted");
			}
	}
}

public class InterrupDemo
{
	public static void main(String[] args)
	{
		InterrupTest i= new InterrupTest();
		i.start();
		i.interrupt();
		System.out.println("End of main");
	}
}
	

	


