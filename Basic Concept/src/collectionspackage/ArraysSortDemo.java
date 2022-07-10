package collectionspackage;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] a= {10,5,20,11,6};
		System.out.println("Primitive array before sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive array after sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		String[] s= {"A","Z","B"};
		System.out.println("Object array before sorting");
		for(String a2:s)
		{
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("Object array after sorting");
		for(String a2:s)
		{
			System.out.println(a2);
		}
		Arrays.sort(s,new MyObject());
		System.out.println("Object array after sorting by Comparator:");
		for(String a2:s)
		{
			System.out.println(a2);
		}

	}

}
class MyObject implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
	}