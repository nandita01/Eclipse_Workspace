package collectionspackage;

import java.util.Comparator;
import java.util.TreeSet;

public class StringComparatorDemo 
{
	public static void main(String[] args)
	{
		//TreeSet t=new TreeSet();
		TreeSet t=new TreeSet(new MyCom());
		t.add("Nandita");
		t.add("Gourav");
		t.add("Adwik");
		t.add("Naman");
		t.add("Sonu");
		System.out.println(t);
	}
}
class MyCom implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		//String s2=obj2.toString();
//		return s2.compareTo(s1);
		return -s1.compareTo(s2);
		
	}
	}
