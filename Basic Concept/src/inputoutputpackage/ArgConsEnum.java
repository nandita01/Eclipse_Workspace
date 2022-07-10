package inputoutputpackage;
enum Beer
{
	KF(100),KO(80),RC(120),FO;
	int price;
	Beer(int price)
	{
		this.price=price;
	}
	Beer()
	{
		this.price=65;
	}
	public int getprice()
	{
		return price;
	}

}

public class ArgConsEnum {

	public static void main(String[] args) {
		Beer[] b=Beer.values();
		for(Beer b1:b)
		{
			System.out.println(b1+"...."+b1.getprice());
		}

	}

}
