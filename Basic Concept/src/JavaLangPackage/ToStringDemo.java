package JavaLangPackage;

import java.util.*;

public class ToStringDemo {
	public String toString()
	{
		return "ToStringDemo";
		}
	public static void main(String[] args) {
		String s=new String("pari");
		System.out.println(s);
		Integer i=new Integer(10);
		System.out.println(i);
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l);
		ToStringDemo t=new ToStringDemo();
		System.out.println(t);
		
		
	}

}

