package multithreadingpackage;
class Test1
{
  void add()
  {
	 System.out.println("child"); 
  }	

}
public class TestProblem {
	public static void main(String[] args) {
		
		System.out.println("Nandita");
		Test1 t=new Test1();
		t.add();
		
		
	}
	
	
	}


