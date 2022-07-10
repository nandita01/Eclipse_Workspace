package JavaLangPackage;
	public class EqualForContentDemo
	{
		String name;
		int rollno;
		EqualForContentDemo(String name,int rollno)
		{
			this.name=name;
			this.rollno=rollno;
		}
		public boolean equals(Object obj)
		{
			String name1=this.name;
			int rollno1=this.rollno;
			EqualForContentDemo e=(EqualForContentDemo)obj;
			String name2=e.name;
			int rollno2=e.rollno;
			if(name1.equals(name2) && rollno1 == rollno2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			public static void main(String[] args)
			{
				EqualForContentDemo e1= new EqualForContentDemo("ravi",101);
				EqualForContentDemo e2= new EqualForContentDemo("mini",102);
				EqualForContentDemo e3= new EqualForContentDemo("ravi",101);
				EqualForContentDemo e4=e1;
				System.out.println(e1.equals(e2));
				System.out.println(e1.equals(e3));
				System.out.println(e1.equals(e4));
			}
		
	}
