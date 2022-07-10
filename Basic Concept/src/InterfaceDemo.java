interface I1
{
	void show();
}
/*interface I2
{
	void display();
}*/
public class InterfaceDemo  implements I1
{
	public void show()
	{
		System.out.println("First interface");
	}
	/*public void display()
	{
		System.out.println("interface second");
	}*/
		public static void main(String[] args)
		{
			InterfaceDemo I = new InterfaceDemo();
			I.show();
			//I.display();

		}
	
}


	


