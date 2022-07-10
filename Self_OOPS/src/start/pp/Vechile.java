package start.pp;

public abstract class Vechile {
	public abstract int getno();
}
 class Bus extends Vechile
{
	public int getno()
	{
		return 2;
	}
}
 class Car extends Vechile
 {
	 public int getno()
	 {
		 return 4;
	 }
 }
 class TestVechile
 {
	 public static void main(String[] args) {
		Bus bus=new Bus();
		System.out.println(bus.getno());
		
		Car car=new Car();
		System.out.println(car.getno());
	}
 }
 
