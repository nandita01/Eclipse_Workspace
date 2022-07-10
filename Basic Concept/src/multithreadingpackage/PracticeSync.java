package multithreadingpackage;
class Hello
{
	
	

	public synchronized void hi(String name)
	{
		for(int i=1;i<6;i++)
		{
			System.out.println("Prestige point");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
			System.out.println(name);
		}
	}
	public synchronized  void hi1(String name)
	{
		for(int i=1;i<6;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
			System.out.println(name);
		}
		
	}
}


	
class PracSync extends Thread
{
	Hello h;
	String name;
	PracSync(Hello h1,String name)
	{
		this.h=h1;
		this.name=name;
	}
	public void run()
	{
		h.hi(name);
	}
}
	class PracSync1 extends Thread
	{
		Hello h;
		String name;
		PracSync1(Hello h1,String name)
		{
			this.h=h1;
			this.name=name;
		}
		public void run()
		{
			h.hi1(name);
		}
		
	
}

public class PracticeSync
{
	public static void main(String[] args) {
		Hello h=new Hello();
		PracSync p1=new PracSync(h,"Nandita");
		
		PracSync1 p2=new PracSync1(h,"rathore");
		p1.start();
		p2.start();
		
		
	}
}


