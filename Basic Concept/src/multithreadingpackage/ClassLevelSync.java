package multithreadingpackage;
class Top
{
	public void how()
	{
		System.out.println("Hello 1");
		/*System.out.println("Hello 2");
		System.out.println("Hello 3");*/
		
		
			
		
		synchronized(Top.class)
		{
			for(int i=1;i<6;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {}
			}
		}		}
	
}
class MyCLassSync extends Thread
{
	Top t;
	MyCLassSync(Top t)
	{
		this.t=t;
	}
	public void run()
	{
		t.how();
	}
	
	}

public class ClassLevelSync {

	public static void main(String[] args) {
		Top t1=new Top();
		 
	
		 MyCLassSync cs1=new MyCLassSync(t1);
		 MyCLassSync cs2=new MyCLassSync(t1);
		 cs1.start(); 
		 cs2.start();
		 
		
		

	}

}
