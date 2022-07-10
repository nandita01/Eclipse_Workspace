package collectionspackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Pooja");
		l.add("Shivani");
		l.add("Vanshika");
		l.add("Divyanshi");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Shivani"))
			{
				ltr.remove();
			}
			//System.out.println(l);
			else if(s.equals("Vanshika"))
			{
				ltr.add("Kanha");
			}
			else if(s.equals("Pooja"))
			{
				ltr.remove();
			}
			while(ltr.hasNext()) {
				if(s.equals("Divyanshi"))
				{
					ltr.add("pooja");
				}//else {
				//	System.out.println("in else");
				
			}
		
		}
		System.out.println(l);
	}
}
		
//		LinkedList ll=new LinkedList(l);
//		ListIterator ltr1 = ll.listIterator();
//		while(ltr1.hasNext())
//		{
//			String s1=(String)ltr1.next();
//			if(s1.equals("Kanha"))
//			{
//				//ltr1.remove();
//				ltr1.set("Aayush");
//			}
//		}
//		System.out.println(ll);

//}}
