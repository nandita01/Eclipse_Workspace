package collectionspackage;

import java.util.PriorityQueue;

public class ProrityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		
		System.out.println(p.poll());
		//System.out.println(p.element());
		for(int i=0;i<11;i++)
		{
			p.offer(i);
		}
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);

	}

}
