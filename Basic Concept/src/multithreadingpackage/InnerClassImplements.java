package multithreadingpackage;
interface I 
{
	void m();
}
public class InnerClassImplements
{
	public static void main(String[] args)
	{
	I i=	new I() {
			public void m() { System.out.println("Hi");
		}
		
	};
	
	i.m();
}
}
/*public class InnerClassImplements {
	public static void main(String[] args) {
		Runnable r=new Runnable()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Child thread");
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}
		
				
	}

}*/
