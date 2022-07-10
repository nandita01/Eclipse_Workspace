package collectionspackage;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap m=new HashMap();
//		System.out.println(m.put(100, "durga"));
//		System.out.println(m.put(102, "durga"));
		m.put(101,"raj");
		m.put(102,"raj");
		m.put(103,"raj");
//		System.out.println(m.put(101,"ravi"));
//		System.out.println(m);
		HashMap m1=new HashMap();
		m1.put(11,"rajveer");
		m1.put(12,"rajat");
		m1.put(13,"rajeev");
	//	m1.putAll(m);
		
		
		//System.out.println(m1);
		
		//System.out.println(m1.get(120));
		System.out.println(m1.get(12));
	//	m1.remove(m);
		//m1.clear();
		System.out.println(m1);
		System.out.println(m1.containsKey(12));
		System.out.println(m1.containsValue("neha"));
		System.out.println(m1.isEmpty());
		
	


	}}
