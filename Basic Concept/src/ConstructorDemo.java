  public class ConstructorDemo
 {
	 String name;
	 int rollno;
	 ConstructorDemo(String name, int rollno)
	 {
		this.name=name;
		this.rollno=rollno;
	 }
	 public static void main(String[] args) {
		 ConstructorDemo c1 = new ConstructorDemo("kajal",101);
		 ConstructorDemo c2 = new ConstructorDemo("swati", 102);
		 System.out.println(c1.name+" "+c1.rollno);
		 System.out.println(c2.name+" "+c2.rollno);
				

			

		}
 }

