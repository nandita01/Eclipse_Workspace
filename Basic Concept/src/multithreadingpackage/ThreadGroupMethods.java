package multithreadingpackage;
class MyMethods extends Thread
{
	MyMethods(ThreadGroup g,String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try 
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
	}
	}

public class ThreadGroupMethods {

	public static void main(String[] args) throws Exception
	{
		
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
		ThreadGroup sg=new ThreadGroup(" small Group");
		MyMethods m1=new MyMethods(pg,"Child Thread1");
		MyMethods m2=new MyMethods(pg,"Child Thread2");
		MyMethods m3=new MyMethods(pg,"Child Thread3");
		m1.start();
		m2.start();
		m3.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		/*pg.list();
		Thread.sleep(100000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();*/
	
		
	}

	
}
