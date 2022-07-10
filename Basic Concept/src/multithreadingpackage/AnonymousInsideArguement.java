package multithreadingpackage;
class AB
{ 
	AB() 
	{ System.out.println("Zero argument"); }  
	AB(AB a) 
	{
		a.go();
	}
	public void go()
	{
	System.out.println("Hello");
	}
}

public class AnonymousInsideArguement {
	public static void main(String[] args) {
		// new AB(new AnonymousInsideArguement()
		// new AnonymousInsideArguement(new AB()
		//new AnonymousInsideArguement(new AnonymousInsideArguement()
		//new AB(new AB( )
		new AB(new AB( )
		          {
			     @Override
			     public void go()
			       { System.out.println("Hiii"); 
			       System.out.println(this.getClass().getName());
			       } 
			     
			     
                  }
	
		).go();
		
			
		
		
		
		
		
		
		
		
		
		
		
		// &&&& NEW CODE  BY SIR &&&&
		
	/*new AB(new AB()
        {
	     public void go()
	       {
		   System.out.println("Hy");
	         } });
	*/
		
	}
		 
	
	//public class AnonymousInsideArguement {
	/*public static void main(String[] args) {
		new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<4;i++)
				{
					System.out.println("Child Thread");
				}
			}
				}).start();
		for(int i=1;i<3;i++)
		{
			System.out.println("Main thread");
		}

	}*/
	
	

}
