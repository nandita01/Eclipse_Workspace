package inputoutputpackage;

import java.io.*;

class Account implements Serializable
{
	int i=10;
	 transient int j=20;
}

public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		Account a1=new Account();
		FileOutputStream fos=new FileOutputStream("serializablefile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("serializablefile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account)ois.readObject();
		System.out.println(a2.i+".."+a2.j);
		//System.out.println(a1.i+".."+a1.j);
		
		

	}

}
