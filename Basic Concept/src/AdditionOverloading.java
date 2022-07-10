
public class AdditionOverloading {
	public int sum(int a,int b)
	{
		return(a+b);
	}
	public int sum(int a,int b,int c)
	{
		return(a+b+c);
	}
	public double sum(double a,double b)
	{
		return(a+b);
	}
	public static void main(String[] args) {
		AdditionOverloading A = new  AdditionOverloading();
		System.out.println("Addition of two numbers is : " +(A.sum(10,20)));
		System.out.println("Addition of three numbers is :"+(A.sum(10,20,30)));
		System.out.println("Addition of two float numbers is :"+(A.sum(10.5,20.5)));
	
		
		
	
	}

}
