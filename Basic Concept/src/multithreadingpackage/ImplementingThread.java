package multithreadingpackage;
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child method");
		}
		
	}
	
}

public class ImplementingThread {

	public static void main(String[] args) {
		MyRunnable m=new MyRunnable();
		Thread t=new Thread(m);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main method");
		}

	}

}
