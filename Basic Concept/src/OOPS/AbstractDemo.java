package OOPS;
 abstract class Parent
{
//	 String name;
//	 int rollno;
	 String name="Nandita";
	 int rollno=101;
	 public abstract  void study();
	}
 class Child extends Parent
 {
	 //String clg;
 String clg="MNDC";
	 public void study()
	 {
		 System.out.println("Study in Prestige Point");
	 }
 }

public class AbstractDemo {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("Name is:"+c.name);
		System.out.println("Rollno is:"+c.rollno);
		System.out.println("College is:"+c.clg);
		c.study();
		

	}

}
