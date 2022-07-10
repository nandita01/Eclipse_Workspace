package multithreadingpackage;

public class NestingInner {
	class A
	{
		class B{
			void m1()
			{
				System.out.println("Hello");
			}
		}
	}
	public static void main(String[] args) {
		NestingInner n= new NestingInner();
		NestingInner.A a=n.new A();
		NestingInner.A.B b=a.new B();
		b.m1();
	}

}
