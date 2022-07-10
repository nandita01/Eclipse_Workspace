package collectionspackage;

import java.util.Arrays;
import java.util.List;

public class AsListArrayDemo {

	public static void main(String[] args) {
		String[] s= {"A","Z","B"};
		List l=Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1,"L");
		System.out.println(l);
		//l.add("Neha");
		//l.remove(2);
		//l.set(1, new Integer(10));
		System.out.println(l);
	}

}
