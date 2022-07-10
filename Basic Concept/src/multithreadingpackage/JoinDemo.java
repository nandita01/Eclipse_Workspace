package multithreadingpackage;
class JoinThread extends Thread
{
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			System.out.println("Child thread");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{}
		}
	}
	}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException
	{
		JoinThread j1=new JoinThread();
		//JoinThread j2=new JoinThread();
		j1.start();
		//j2.start();
		j1.join();
		
		
		
		
		
		for(int i=1;i<3;i++)
		{
		System.out.println("Nandita Rathore");
		}

	}

}
