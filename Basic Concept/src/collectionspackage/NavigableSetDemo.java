package collectionspackage;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(60);
		t.add(20);
		t.add(12);
		t.add(50);
		t.add(45);
		t.add(35);
		t.add(25);
		System.out.println(t);
		System.out.println(t.ceiling(25));//20
	//	System.out.println(t.floor(35));//60
    //	System.out.println(t.lower(35));
    //	System.out.println(t.higher(35));
    	System.out.println(t.pollFirst());//20
    	System.out.println(t.pollLast());
    	System.out.println(t);
    	System.out.println(t.descendingSet());
    	System.out.println(t);
//		System.out.println(t);
		

	}

}
