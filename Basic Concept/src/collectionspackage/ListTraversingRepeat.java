package collectionspackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTraversingRepeat {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nandita");
		al.add("Karan");
		al.add("Adwik");
		al.add("Jaha");
		
		 // @@@@@@ FOREACH LOOP TRAVERSING 
			for(String str:al)
			{
				System.out.println(str);
//				System.out.print(str+ "\t" +str.length()+ "\t");
//				StringBuffer br = new StringBuffer(str);
//				System.out.println(br.reverse());
			}
		//  @@@@@@  TRAVERSING UING ITERATOR: FORWARD  @@@@@@ 
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
		String next = itr.next();
		System.out.println(next);
		}
		
		
		
	//  @@@@@@  TRAVERSING UING ListITERATOR: BACKWARD @@@@@@ 
			ListIterator<String> ltr = al.listIterator(); 
			
			while(ltr.hasPrevious())
			{
			String previous = ltr.previous();
			System.out.println(previous);
			}
		
	
			
	}

}
