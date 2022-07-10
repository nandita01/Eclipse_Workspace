
 class A {
	public void m1()
	{
		System.out.println("gold+cash+property");
	}
	public void marry()
	{
		System.out.println("Laxmi");
	}
 }
	 public class InheritanceDemo extends A
	{
		public void m2()
		{
			System.out.println("No marry with laxmi and i want property");
		}
		public static void main(String[] args) {
			InheritanceDemo i = new InheritanceDemo();
			i.m1();
			i.marry();
			i.m2();
			
			
			
		}
	}





	/*class Teacher
	{
		String TeacherName="Savita";
		String designation="Java Expert";
	}
	public class InheritanceDemo extends Teacher

	{
		String collegeName="Medicaps Uniuversity";
		public static void main(String[] args) {
			InheritanceDemo i = new InheritanceDemo();
			System.out.println("College Name: "+i.collegeName);
			System.out.println("Teacher Name: "+i.TeacherName);
			System.out.println("Designation: "+i.designation);
			
		}
		
	}*/
 	