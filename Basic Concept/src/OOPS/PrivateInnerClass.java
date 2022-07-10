package OOPS;

import OOPS.Outer.Inner;

class Outside
{
	int x=10;
	private class Inside{
		  int y=20;
		
		  
	}
	void m()
	{
		Inside i = new Inside();
		System.out.println(i.y);
	}
	
}

public class PrivateInnerClass {

	public static void main(String[] args) {
		Outside out=new Outside();
		System.out.println(out.x);
		out.m();
//		Outside.Inside in=out.new Inside();
//		System.out.println(in.y);

	}

}
