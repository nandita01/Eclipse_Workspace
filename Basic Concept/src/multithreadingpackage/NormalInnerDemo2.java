package multithreadingpackage;

public class NormalInnerDemo2 {
	int x=10;
	static int y=20;
	class MyInner
	{
		void m1()
		{
			System.out.println("Value of x is: "+x);
			System.out.println("Value of y is: "+y);
		}
	}
	public static void main(String[] args)
	{
		NormalInnerDemo2 n= new NormalInnerDemo2();
		NormalInnerDemo2.MyInner i=n.new MyInner();
		i.m1();
		
		//new NormalInnerDemo2().new MyInner().m1();
		/*NormalInnerDemo2.MyInner i=new NormalInnerDemo2().new MyInner();
		i.m1();*/
	}

}
