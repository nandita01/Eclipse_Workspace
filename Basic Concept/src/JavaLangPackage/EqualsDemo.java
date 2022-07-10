package JavaLangPackage;

public class EqualsDemo {
	String name;
	int rollno;
	EqualsDemo(String name,int rollno)
	{
		this .name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		EqualsDemo e1=new EqualsDemo("Kajal",101);
		EqualsDemo e2=new EqualsDemo("swati",102);
		EqualsDemo e3=new EqualsDemo("Kajal",101);
		EqualsDemo e4=e1;
		/*System.out.println(e1==e2);
		System.out.println(e1==e3);*/
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e4.equals(e4));
		
		
		

	}

}
