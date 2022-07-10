package collectionspackage;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap m=new LinkedHashMap();
		m.put(1,"Nandita");
		m.put(2,"Adwik");
		m.put(3,"Kavya");
		m.put(4,"Yuvi");
		m.put(5,"Mohan");
		//m.remove(3);
		System.out.println(m);
		System.out.println(m.get(4));
		m.remove(5);
		System.out.println(m);
	}

}
