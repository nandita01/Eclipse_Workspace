package collectionspackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// REVISION PRACTICE CODE
		//@@@@@@@@ DUPLICATES ARE ALLOWED AND INSERTION ORDER MUST PRESERVED @@@@@@@
		//ArrayList<String> al = new ArrayList<>();  TYPE SAFE ONLY STRING ADDED
		ArrayList al = new ArrayList();  // NO TYPE SAFE ALL ELEMENTS ADDED
		al.add("Nandita");
		al.add(11);
		al.add("Rathore");
		al.add(21);
		al.add(null);
		al.add(21);
		System.out.println("SIZE = "+al.size());
		System.out.println(al.contains("Nandita Rathore")); // @@ ITEMS IS THERE OR NOT
		System.out.println(al.contains(21));
		System.out.println(al.isEmpty());	// CHECK FOR EMPTY
 		System.out.println(al);
 		al.set(0, "Adwik"); // 0 index ko remove krke set kr dega
 		System.out.println(al);
 		al.add(0,"Motu");
 		System.out.println(al);// 0 index pr set kr dega or bki ko shift kr dega
// 		al.clear(); 	// CLEAR ALL ELEMENTS
// 		System.out.println(al);
 		
 		System.out.println("@@@@@@@ AFTER ADDING ALL ELEMENT IN LINKEDLIST @@@@@@");
 		LinkedList ll = new LinkedList();
 		ll.addAll(al);
 		System.out.println(ll);
	
	}

}
