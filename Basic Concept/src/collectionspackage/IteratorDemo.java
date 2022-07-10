package collectionspackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
//		l.add("a");
//		l.add("b");
//		l.add(null);
		System.out.println(l);
		Iterator itr=l.iterator();
		
		//while(itr.hasNext())
		for(;itr.hasNext();)
		{
			Integer i=(Integer) itr.next();
			if( i%2==0)
			{
				System.out.println(i);
			}
			else
			{
			itr.remove();
			}
			
		}
		System.out.println(l);	
		
				

	}

}
//for(itr.hasNext())
//{
//	int s=0;
//		if(s%2==0)
//		{
//			System.out.println(s);
//			}
//		else
//		{
//			itr.remove();
//		}
//		s++;
//}
//	
