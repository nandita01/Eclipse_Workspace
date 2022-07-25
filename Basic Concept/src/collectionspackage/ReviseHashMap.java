package collectionspackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ReviseHashMap {

	public static void main(String[] args) {
	HashMap m = new HashMap();
	m.put("Nandu", 500);
	m.put("Duggu", 600);
	m.put("Adwik", 800);
	m.put("Pakhi", 1000);
	
	System.out.println(m);
	m.put("Nandu", 2000);
	System.out.println(m);
	
	//  FOR PRINTING KEYS
	 Set s2 = m.keySet();
	 System.out.println(s2);
	 
	//  FOR PRINTING VALUES
	Collection c = m.values();
	System.out.println(c);
	
//  FOR PRINTING ENTRY
	Set s1 = m.entrySet();
	System.out.println(s1);
	
	//Iterator itr = s1.iterator();
	//System.out.println(m1.getKey()+ "....." +m1.getValue());

	}
	}


