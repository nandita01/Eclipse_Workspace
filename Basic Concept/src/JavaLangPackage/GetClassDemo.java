
package JavaLangPackage;
import java.lang.reflect.*;
public class GetClassDemo {

	public static void main(String[] args)
	{
		int count=0;
		Object o=new String("durga");
		Class c=o.getClass();
		System.out.println("Fully qualified name of class:"+c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Methods information");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
			System.out.println("The number of methods:"+count);
		}
	}

}
