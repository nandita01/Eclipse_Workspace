package multithreadingpackage;
interface Outer
{
	public void m1();
	interface Inner
	{
	public void m2();
	}
}
class Test3 implements Outer
{
	public void m1()
	{
		System.out.println("Outer interface  method implemented");
	} 
}

 class Test4 implements  Outer.Inner
{
	public void m2()
	{
	System.out.println("Inner Method Interface");	
	}
}
public class InterfaceOuterDemo
{
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.m1();
		
		Test4 t4=new Test4();
		t4.m2();
		
	}
	}