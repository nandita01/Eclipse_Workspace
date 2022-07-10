package JavaLangPackage;
class ImmutableDemo
{
	int i;
	ImmutableDemo(int i)
	{
		this.i=i;
	}
	public ImmutableDemo  modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return (new ImmutableDemo (i));
		}

	}


	public static void main(String[] args) {
		ImmutableDemo m1= new ImmutableDemo(10);
		ImmutableDemo m2= new ImmutableDemo(100);
		ImmutableDemo m3= m1. modify(10);
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		

	}

}
