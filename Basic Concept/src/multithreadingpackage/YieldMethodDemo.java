package multithreadingpackage;
class YieldTest extends Thread
{
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println("Child method");
		}
	}
}

public class YieldMethodDemo {

	public static void main(String[] args) {
		YieldTest y=new YieldTest();
		y.start();
		y.setPriority(10);
		//Thread.currentThread().setPriority(9);
		for(int i=0;i<5;i++)
		{
			System.out.println("Main method");
		}

	}

}
