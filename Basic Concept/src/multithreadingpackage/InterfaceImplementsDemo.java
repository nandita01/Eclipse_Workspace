package multithreadingpackage;
interface Vechile
{
	public int getNoOfWheels();
	
}
class DefaultVechile implements Vechile
{
	public int  getNoOfWheels()
	{
		return 2;
	}
}
class Bus implements Vechile
{
	public int  getNoOfWheels()
	{
		return 6;
	}
}
public class InterfaceImplementsDemo 
{
	public static void main(String[] args)
	{
		 /*Vechile.DefaultVechile d = new Vechile.DefaultVechile();
		 System.out.println(d.getNoOfWheels());*/
		DefaultVechile d=new DefaultVechile();
		System.out.println(d.getNoOfWheels());
		
		
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());
	}
}
