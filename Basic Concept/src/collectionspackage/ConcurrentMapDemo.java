package collectionspackage;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap m=new ConcurrentHashMap();
		m.put(101,"Nandita");
		m.put(102,"adwik");
		m.put(103,"Shiva");
		System.out.println(m);
		m.putIfAbsent(104,"Neha");
		System.out.println(m);
		m.putIfAbsent(101,"d");
		m.remove(101,"Nandita");
		m.replace(102,"adwik","rahul");
		System.out.println(m);

	}

}
