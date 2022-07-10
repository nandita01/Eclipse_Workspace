
class P {
	public void property()
	{
		System.out.println("cash+property");
	}
	public void marry()
	{
		System.out.println("Laxmi");
	}
}
	class C extends P
	{
		public void marry()
		{
			System.out.println("isha");
		}
	}
		
	public class OverridingDemo 
			{
				public static void main(String[] args) {
					/*C c = new C();
					c.property();
					c.marry();*/
					
					/*P p = new P();
					p.property();
					p.marry();*/
					
					P p1 = new C();
					p1.marry();
					
			
		   }
		}
	


