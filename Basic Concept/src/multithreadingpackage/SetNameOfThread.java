package multithreadingpackage;
class MyChild extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child method "+Thread.currentThread().getName());
		}
	}
	}

public class SetNameOfThread {

	public static void main(String[] args) {
		MyChild m=new MyChild();
		m.setName("hello");
		m.start();
		Thread.currentThread().setName("Nandita");
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName());
		}
		

	}

}
