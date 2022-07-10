package JavaLangPackage;

public class MixToStringAndHashCode {
	int i;
	MixToStringAndHashCode(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+"";
		
	}
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args) {
		MixToStringAndHashCode m1=new MixToStringAndHashCode(10);
		MixToStringAndHashCode m2=new MixToStringAndHashCode(100);
		System.out.println(m1);
		System.out.println(m2);

	}

}
