package collectionspackage;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityCustomizedDemo {

	public static void main(String[] args) {
		//PriorityQueue q=new PriorityQueue();
		PriorityQueue q=new PriorityQueue(new MySorting());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
	}
}
class MySorting implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
//String s2=obj2.toString();
		String s2=(String)obj2;
		//return s2.compareTo(s1);
		//return -s2.compareTo(s1);
		return s2.compareTo(s1);
	}
	}
