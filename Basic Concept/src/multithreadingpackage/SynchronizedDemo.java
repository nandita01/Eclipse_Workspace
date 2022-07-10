package multithreadingpackage;
class Display
{
	public  synchronized void wish(String name)
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("Good Morning: ");
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
class SyncTest extends Thread
{
		Display d;
		String name;
		SyncTest(Display d,String name)
		{
			this.d=d;
			this.name=name;
		}
		public void run()
		{
			d.wish(name);
		}
}
 class SynchronizedDemo
{
	 public static void main(String[] args) {
		 Display d1=new Display();
		 SyncTest m1=new SyncTest(d1,"dhoni");
		 SyncTest m2=new SyncTest(d1,"yuvraj");
		m1.start();
		m2.start();
	}
	}

		
