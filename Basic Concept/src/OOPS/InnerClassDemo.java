package OOPS;
class Outer
{
	int x=10;
	class Inner
	{
		int y=20;
	}

}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer myOuter=new Outer();
		//System.out.println(o.x);
		Outer.Inner myInner= myOuter.new Inner();
		//System.out.println(i.y);
		//System.out.println("Addition is:"+myInner.y + myOuter.x);
		int result= myInner.y+ myOuter.x;
		//System.out.println("Addition is:"+myInner.y + myOuter.x);
		System.out.println(result);
	}

}
