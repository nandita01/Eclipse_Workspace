package multithreadingpackage;

public class MethodLocalInner
{
	public void m1()
	{
		class MyMethod
		{
			public void sum(int x,int y)
			{
				System.out.println("Sum is:"+(x+y));
			}
		}
			MyMethod m=new MyMethod();
			m.sum(10,20);
			m.sum(100,200);
			m.sum(1000, 2000);
		}
	
	
	public static void main(String[] args) {
		MethodLocalInner c=new MethodLocalInner();
		c.m1();
	}

}
