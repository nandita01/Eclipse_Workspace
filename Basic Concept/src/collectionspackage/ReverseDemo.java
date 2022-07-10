package collectionspackage;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(50);
		l.add(10);
		l.add(38);
		l.add(0);
		l.add(4);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
