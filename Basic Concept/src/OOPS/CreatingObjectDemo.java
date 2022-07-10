package OOPS;

public class CreatingObjectDemo {
	public void fullThrottle()
	{
		System.out.println("The car is going as fast as it can!");
	}
	//static void speed(int maxSpeed )
	public void speed(int maxSpeed )
	{
	System.out.println("Max speed is: " + maxSpeed);	
	}
	

	public static void main(String[] args) {
		CreatingObjectDemo myCar=new CreatingObjectDemo();
		myCar.fullThrottle();
		myCar.speed(120);
		//speed(180);

	}

}
