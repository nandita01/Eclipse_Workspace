package multithreadingpackage;
class SleepThread extends Thread 
{ 
	public void run()
	{
		try
		{
			
			//System.out.println("child method:");
			for(int i=1;i<4;i++)
			{
				Thread.sleep(1000);
				System.out.println("child method:"+i);
			}
			
		}
		catch(InterruptedException e)
		{}
		
	}
}
public class SleepDemo {

	public static void main(String[] args) {
		SleepThread s=new SleepThread();
		s.start();
		System.out.println("Main method:");
		/*for(int i=1;i<3;i++)
		{
			System.out.println("Main method:");
			
		}*/
		
		

	}

}
