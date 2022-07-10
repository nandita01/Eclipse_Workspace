package start.pp;
interface interf
{
	public void m1();
	public void m2();
}

 abstract  class sub implements interf {
	public void m1()
	{
		System.out.println("M1 method implementation");
	}
	//%%%%%%%%%%% IF WE DON'T WANT IMPLEMENTATION OF M2 THEN DECLARE CLASS AS ABSTRACT %%%%%%%
//	public void m2()
//	{
//		System.out.println("M2 method implementation");
//	}
}
 public class  InterfaceDemo extends sub
 {
	 public void m2()
		{
			System.out.println("M2 method implementation");
		}
 }
class InterfaceTest
{
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.m1();
		id.m2();
	}
}
