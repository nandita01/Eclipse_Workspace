package EightFeatures;
interface Vechile
{
	String getBrand();
	String speedUp();
	String slowDown();
	default String turnAlaramOn()
	{
		return "turning vechile alarm on";
	}
	static String getCompany()
	{
		return "Microsoft";
	}
	default String turnAlaramOff()
	{
		return "turning vechile alarm off";
	}
	
}
class Car implements Vechile
{
	public String getBrand()
	{
		return "BMW";
	}
	public String speedUp()
	{
		return "the car is speedup";
	}
	public String slowDown()
	{
		return "the car is slowdown";
	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		Car car=new Car(); 
		//Vechile i= new Car ();
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlaramOn());
		System.out.println(Vechile.getCompany());
		System.out.println(car.turnAlaramOff());
		//System.out.println(Vechile.getCompany());

	}

}
