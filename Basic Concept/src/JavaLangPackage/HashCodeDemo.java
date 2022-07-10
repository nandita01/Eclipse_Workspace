package JavaLangPackage;

public class HashCodeDemo {
	int i;
	HashCodeDemo(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}

	
	public static void main(String[] args) {
		HashCodeDemo h1=new HashCodeDemo(10);
		HashCodeDemo h2=new HashCodeDemo(100);
		System.out.println(h1);
		System.out.println(h2);

	}

}
