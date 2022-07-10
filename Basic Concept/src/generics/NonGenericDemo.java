package generics;

import java.util.ArrayList;

public class NonGenericDemo {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Nandita");
		l.add(null);
		l.add("Adwik");
		//l.add(10);
		m1(l);
		System.out.println(l);
		//l.add(40);

	}
public static void m1(ArrayList l)
{
	l.add(20);
	l.add(true);
	l.add("meet");
	//l.add(null);
	}
}
