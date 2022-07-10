package inputoutputpackage;
enum color
{
	Red,Green,Blue,Yellow,Black;
	}

public class ValuesEnumDemo {

	public static void main(String[] args) {
		color[] c=color.values();
		for(color c1:c)
		{
			//System.out.println(c1);
			System.out.println(c1+"....."+c1.ordinal());
		}

	}

}
