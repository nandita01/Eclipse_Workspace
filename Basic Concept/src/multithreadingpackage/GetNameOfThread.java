package multithreadingpackage;
class Test extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Method "+Thread.currentThread().getName());
		}
	}
	}

public class GetNameOfThread {

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Method "+Thread.currentThread().getName());
		}

	}

}
