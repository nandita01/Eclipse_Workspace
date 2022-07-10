package JavaLangPackage;
public class NormalProgram
{
	// OVERRIDE TOSTRING METHOD CODE
	
	// FINISH
		String name;
		int rollno;
		NormalProgram(String name,int rollno)
		{
			this.name=name;
			this.rollno=rollno;
		}
		public String toString() 
		{
			return name+" "+rollno;
		}
		public static void main(String[] args) {
			NormalProgram n1=new NormalProgram("jay",101);
			NormalProgram n2=new NormalProgram("aakash",102);
			
			System.out.println(n1);
			//System.out.println(n1.toString());
			System.out.println(n2);
			
		

	}

}
