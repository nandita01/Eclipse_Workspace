
public class MethodOverloadingDemo {
	public void m1()
	{
		System.out.println("no-arg method");
	}
	public void m1(int i)
	{
		System.out.println("integer- arguement method");
	}
	public void m1(double d)
	{
		System.out.println("double-arguement method");
	}
	public static void main(String[] args) {
		MethodOverloadingDemo e = new MethodOverloadingDemo();
		e.m1();
		e.m1(10);
		e.m1(10.5);
	}
	
}
