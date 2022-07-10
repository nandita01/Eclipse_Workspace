package multithreadingpackage;
class SyncObj
{
	public void hi()
	{
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println();
		synchronized(this)
		{
			for(int i=1;i<7;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {}
			}
		}
		System.out.println();
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println();
	}
	}
class MyThread1 extends Thread
{
	SyncObj s;
	MyThread1(SyncObj s)
	{
		this.s=s;
	}
	public void run()
	{
		s.hi();
	}
}
class MyThread2 extends Thread
{
	SyncObj s;
	MyThread2(SyncObj s)
	{
		this.s=s;
	}
	public void run()
	{
		s.hi();
	}
}
public class BlockSyncDemo 
{
	public static void main(String[] args) {
		SyncObj s=new SyncObj();
		//SyncObj s1=new SyncObj();
		MyThread1 t1=new MyThread1(s);
		MyThread2 t2=new MyThread2(s);
		t1.start();
		t2.start();
	}

}
