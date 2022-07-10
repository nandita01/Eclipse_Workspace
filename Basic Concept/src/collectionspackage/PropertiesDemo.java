package collectionspackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
	
public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		//FileInputStream fis= new FileInputStream("abc.properties");
		FileInputStream fis= new FileInputStream("H:\\abc.properties");
		p.load(fis);
		System.out.println(p);
	String s=p.getProperty("venki");
//	System.out.println(s);
p.setProperty("adwik", "18");
//System.out.println(p);
p.setProperty("pwd", "1121");
	//System.out.println(p);
		FileOutputStream fos= new FileOutputStream("H:\\abc.properties");
		p.store(fos,"File updated by Prestige Point");
		System.out.println(p);
		Enumeration e=p.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
