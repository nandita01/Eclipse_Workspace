package collectionspackage;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIterate {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Nandita");
		v.addElement("Karan");
		v.addElement("Vandita");
		v.addElement("Adwik");
		v.addElement("Kashish");
		System.out.println(v);
		Enumeration e = v. elements();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			System.out.println(s);
		}
		
	}

}
