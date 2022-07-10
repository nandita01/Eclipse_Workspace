
public class AutomaticPramotionOVerloadingDemo {
	public void m1(int i)
	{
		System.out.println("Integer-arguement method");
	}
	public void m1(float f)
	{
		System.out.println("Float arguement method");
	}
	public static void main(String[] args) {
		AutomaticPramotionOVerloadingDemo A = new AutomaticPramotionOVerloadingDemo();
		A.m1(20);
		A.m1(10.8f);
		A.m1('a');
		A.m1(10l);
		//A.m1(10.5);
	}
}