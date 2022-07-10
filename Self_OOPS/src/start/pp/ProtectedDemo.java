package start.pp;

public class ProtectedDemo {
	protected void m1()
	{
		System.out.println("Protected Method called");
	}
}
	class AB extends ProtectedDemo
	{
		public static void main(String[] args) {
			ProtectedDemo p=new ProtectedDemo();
			p.m1();
			AB ab= new AB();
			ab.m1();
			ProtectedDemo p1=new AB();
			p.m1();
		}
		
	}
	
		


