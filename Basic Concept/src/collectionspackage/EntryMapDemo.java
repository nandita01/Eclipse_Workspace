package collectionspackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Jatin",20 );
		m.put("Dheeraj",21);
		m.put("Nandita",22);
		m.put("Karan",23 );
		System.out.println(m);
	//	System.out.println(m.put(300, "nitin"));
		Set s = m.keySet();
		System.out.println(s);

		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		// System.out.println(m.entrySet());
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
			if(m1.getKey().equals("Nandita")) {
				m1.setValue(7000);
			}
		}
		System.out.println(m);
	}
}
