package multithreadingpackage;

public class MethodLocalInner2 {
	int x=10;
	static int y=20;
	public  void m1()
	{
		class Inner2
		{
			public void m2()
			{
				System.out.println("Value of x: "+x);
				System.out.println("Value of y: "+y);
			}
		}
		Inner2 i=new Inner2();
		i.m2();
	}
	public static void main(String[] args) {
		MethodLocalInner2 m=new MethodLocalInner2();
		m.m1();
	}
	

}
