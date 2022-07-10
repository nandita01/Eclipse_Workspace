package collectionspackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(20, "Jatin");
		m.put(21, "Dheeraj");
		m.put(22, "Nandita");
		m.put(23, "Karan");
		System.out.println(m);
		
		Set s=m.entrySet();
		System.out.println(s);
		Iterator it= s.iterator();
		while (it.hasNext()) {
			Map.Entry m2=(Map.Entry)it.next();
			if(m2.getKey().equals("Jatin")) {
				m2.setValue(2000);
			}
		}
		System.out.println(m);



	}

}
