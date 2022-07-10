package collectionspackage;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		//System.out.println(v.capacity());
		v.addElement(18);
		v.addElement("null");
		v.addElement(50);
		v.addElement("Neha");
		v.addElement(18);
		System.out.println(v);
		for(int i=1;i<=16;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
//		System.out.println(v.get(3));
//		System.out.println(v.elementAt(0));
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
		int size=v.size();
		System.out.println(size);
		int capacity=v.capacity();
		System.out.println(capacity);
		
		
		//System.out.println(v);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Vector v=new Vector(100,3);
		/*for(int i=1;i<100;i++)
		{
			v.addElement(i);
		}
		for(int i=1;i<50;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);*/
		
	}

}
