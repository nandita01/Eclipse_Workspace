package collectionspackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List a=new ArrayList();
	//	ArrayList a=new ArrayList();
		a.add(18);
		a.add(21);
		a.add(18);
		a.add(null);
		a.add("Nandita");
	
		//System.out.println(a);
		
		//LinkedList l=new LinkedList(a);
		
		ArrayList l=new ArrayList(a);
		l.add(45);
		l.add(0,"go");
		l.set(0,"hyy");
		System.out.println(a.containsAll(l));
		
		
		
		
		ArrayList l1=new ArrayList(l);
		
		//System.out.println(l1.containsAll(l));
		
		/*
		 * System.out.println(l); l.remove(4); System.out.println(l); l.remove(1);
		 System.out.println(l);
	//System.out.println(l.containsAll(l));
		System.out.println(l.containsAll(a));
		//System.out.println(a.containsAll(a));
		//System.out.println(a.containsAll(l));
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * //l.removeAll(a); System.out.println(l); l.removeFirst();
		 * System.out.println(l); l.remove(a); l.rem
		 * 
		 * System.out.println(l); l.addFirst(12);
		 */	//System.out.println(l);
		 
		
		
		
		/*
		 * //a.remove(0); a.remove(1); System.out.println(a); a.add(1,30);
		 * System.out.println(a); a.add("rathore"); System.out.println(a);
		 * a.add(2,null); System.out.println(a); a.remove(null); System.out.println(a);
		 * a.remove("Nandita"); System.out.println(a); a.remove(30);
		 * System.out.println(a);
		 */
		
	}

}
