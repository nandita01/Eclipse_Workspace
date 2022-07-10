package multithreadingpackage;
class TestPriority extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Child Thread Priority: "+Thread.currentThread().getPriority());	
		}	
	}
	
}

public class GetPriorityOfThread {
	public static void main(String[] args) {
		TestPriority t=new TestPriority();
		t.start();
		//t.setPriority(10);
		t.setPriority(7);
		Thread.currentThread().setPriority(7);
		for(int i=0;i<10;i++)
		{
		System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
		}
		
	}

}
