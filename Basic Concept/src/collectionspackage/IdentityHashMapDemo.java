package collectionspackage;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
      HashMap h=new HashMap();

      Integer i1=new Integer(10);
      Integer i2=new Integer(20);
 
 //   System.out.println(i1.equals(i2));
      h.put(i1, "java");
      h.put(i2, "ph");
   
   
 //     System.out.println(h);
    
         //
         
      i1=i2;
      IdentityHashMap i=new IdentityHashMap();
      //i.put(i1, "Nandita");
      i.put(i1, "neha");
      i.put(i2, "Nandita");
  //    System.out.println(i1==i2);
      System.out.println(i);
       
       // System.out.println(i1.equals(i2));
		
	}

}
