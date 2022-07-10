class Parent43
{
	void m1()
	{
		System.out.println("Parent class method");
	}
}
   public class SuperDemo1 extends Parent43
{
	void m2()
	{
		m1();
		System.out.println("Child class method");
	}
	void m3()
	{
		m1();
		System.out.println("Nandita ");
		m2();
	}

	public static void main(String[] args) 
	{
		
		SuperDemo1 s = new SuperDemo1();
		
		s.m3();
	}
	
}


/*class Parent 
{  
void m1()  
{ System.out.println("parent class method");  } }
class SuperDemo1 extends Parent
 //class Child extends Parent
   {  void m2()  {   System.out.println("child class method");  } 
      void m3()  {   m2();System.out.println("nandita");   
                          
                      } 
 public static void main(String[] arhs) 
 {   
/*Child c=new Child();   
c.m3();
	 SuperDemo1 s = new SuperDemo1();
	 s.m3();
  }
 }*/

