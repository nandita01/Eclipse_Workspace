public class constructorOverloading
{
	constructorOverloading(double d)
	{
		this(10);
		System.out.println("double arguement constructor");
	}
	constructorOverloading(int i)
	{
		this();
		System.out.println("Integer arguement constructor");
	}
	constructorOverloading()
	{
		System.out.println("No arguement constructor");
	}
	public static void main(String[] args) {
		//constructorOverloading c= new constructorOverloading(10.5);
		//constructorOverloading c= new constructorOverloading(20);
		constructorOverloading c= new constructorOverloading();
	}
}
