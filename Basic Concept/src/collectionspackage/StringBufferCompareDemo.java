package collectionspackage;

//import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferCompareDemo
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		//TreeSet t=new TreeSet(new MyClass());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("P"));
		System.out.println(t);
	}
}
//class MyClass implements Comparator
//{
//	public int compare(Object obj1,Object obj2)
//	{
//	String s1=obj1.toString();
//	String s2=obj2.toString();
//	return s1.compareTo(s2);
//	}
//}
