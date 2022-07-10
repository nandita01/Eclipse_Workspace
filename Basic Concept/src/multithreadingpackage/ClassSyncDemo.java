package multithreadingpackage;

/*Hello h =new Hello();
//Hello h1 =new Hello();
MyThread t1 = new MyThread(h,"Neeraj");
//MyThread t2 = new MyThread(h1,"Paliwal");
MyThread t3 = new MyThread(h,"Neeraj1");
//MyThread t4 = new MyThread(h1,"Paliwal1");
t1.start();
//t2.start();
t3.start();
//t4.start();
}
}*/



 class ClassSync
{
	public static synchronized void hi(String name)
	{
		for(int i=1;i<6;i++)
		{
		System.out.println("Goodafternoon all: ");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println(name);
		}
	}
}
 class MyClass extends Thread
{
	ClassSync c;
	String name;
	MyClass(ClassSync c1,String name)
	{
		this.c=c1;
		this.name=name;
	}
	public void run()
	{
		c.hi(name);
	}
	}
public class ClassSyncDemo 
{
	public static void main(String[] args) {
		ClassSync c=new ClassSync();
		ClassSync c1=new ClassSync();
		MyClass mc1=new MyClass(c,"kajal");
		MyClass mc2=new MyClass(c1,"aakash");
		
		MyClass mc3=new MyClass(c,"swati");
		mc1.start();
		mc2.start();
		mc3.start();
		
		
	}
	}
