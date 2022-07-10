package collectionspackage;

import java.util.HashMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String>h=new TreeMap<String,String>();
		//TreeMap h=new TreeMap();
		//HashMap h=new HashMap();
	//HashMap<String,String>h=new HashMap<String,String>();
	h.put("1","Apple");
	h.put("4","grapes");
	h.put("2","banana");
	h.put("3","Mango");
	h.put("5","Kiwi");
	System.out.println(h);
	System.out.println(h.floorKey("3"));
	System.out.println(h.ceilingKey("5"));
	System.out.println(h.lowerKey("3"));
	System.out.println(h.higherKey("3"));
	System.out.println(h.descendingMap());
	System.out.println(h.pollFirstEntry());
	System.out.println(h.pollLastEntry());

	System.out.println(h);

	}

}
