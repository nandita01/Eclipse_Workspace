package collectionspackage;

import java.util.ArrayList;
import java.util.Iterator;

public class StringCursorDemo {

	public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(1);
	l.add(2);
	l.add("a");
	l.add("b");
	l.add("c");
	System.out.println(l);
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

	}

}
