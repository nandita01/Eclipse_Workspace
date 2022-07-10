package start.pp;

public abstract class AbstractDemo {
//	public abstract String m1();
	public abstract void m1();
	public abstract void m2();
	}

class Test
{
	public static void main(String[] args) {
//		Demo demo=new Demo();
//		demo.m1();
				
		// *********** IMPLEMENTATION OF ABSTRACT METHOD IN TEST CLASS ***********
		
				
		AbstractDemo a=new AbstractDemo()
		{
			public void m1() {
				System.out.println("Abstract method override");
			}
		public void m2()
		{
			System.out.println("Second method");
		}
	};
			a.m1();
			a.m2();
	}
}
