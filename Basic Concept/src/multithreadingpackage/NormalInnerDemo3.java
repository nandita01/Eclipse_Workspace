package multithreadingpackage;

public class NormalInnerDemo3 {
	int x=10;
	class MyInner1
	{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x);
			System.out.println(MyInner1.this.x);
			//System.out.println(this.x);
			
		}
	}
	public static void main(String[] args) {
		 NormalInnerDemo3 n= new  NormalInnerDemo3();
		 NormalInnerDemo3.MyInner1 i= n. new MyInner1();
		 i.m1();
	}

}
