package multithreadingpackage;

public class NormalInnerClass {
	 class MyInner
{
//ACCESSING INNER CLASS CODE FROM STATIC AREA OF OUTER CLASS
	void m1()
	{
	System.out.println("Static area of inner class");
	}

}
	 //******* ACCESSING INNER CLASS CODE FROM INSTANCE  AREA OF OUTER CLASS
	 void m2()
		{
		 MyInner i= new MyInner();
			i.m1();
		}
	 
public static void main(String[] args) {
	NormalInnerClass n=new NormalInnerClass();
	/*NormalInnerClass.MyInner i= n.new MyInner();
	i.m1();*/
	n.m2();
	//System.out.println("Outer class main method");
	
}
	}

