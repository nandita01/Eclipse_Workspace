package multithreadingpackage;
class X
{
	void m()
	{
	for(int i=1;i<6;i++)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{}
	}
	}
}
class Honey
{
	public void hyy(X x)
	{
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		synchronized(x)
		{
			 x.m();
		}
		System.out.println("hii 1");
		System.out.println("hii 2");
		System.out.println("hii 3");
	}
	}
class MyParObj extends Thread
{
	Honey h2;
	X x;
	MyParObj(Honey h3, X x)
	{
		h2=h3;
		 this.x=x;
	}
	public void run()
	{
		h2.hyy(x);
	}
}

public class BlockCurrentDemo
{

	public static void main(String[] args)
	{
		X x1=new X();
		Honey h1=new Honey();
		MyParObj p1=new MyParObj(h1,x1);
		MyParObj p2=new MyParObj(h1,x1);
		p1.start();
		p2.start();
		
	}

}
