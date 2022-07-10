package multithreadingpackage;

public class MethodLocalInner3 {
	public void m1()
	{
		int x=10;
	class Inner3
	{
		public void m2()
		{
			System.out.println(x);
		}
	}
	Inner3 i=new Inner3();
	i.m2();
	}
	
	public static void main(String[] args) {
		MethodLocalInner3 m=new MethodLocalInner3();
		m.m1();
	}

}
