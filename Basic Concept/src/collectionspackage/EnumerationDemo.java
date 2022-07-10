package collectionspackage;
import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector ve=new Vector();
		for(int i=0;i<=10;i++)
		{
			ve.addElement(i);
		}
		System.out.println(ve);
		
		
		Enumeration e= ve.elements();
		
		while(e.hasMoreElements())
		{
			Integer I=(Integer)e.nextElement();
			if(I%2!=0)
			   System.out.println(I);
			
		}
		
		System.out.println(ve);
		}

       

		

}
