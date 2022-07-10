package inputoutputpackage;
import java.io.*;
class Mobile
{
	//transient int i=10;
	int i=10;
//	Mobile()
//	{
//		System.out.println("Parent constructor called");
//	}
}
class Charger  extends Mobile implements Serializable
{
	int j=20;
//	Charger()
//	{
//		System.out.println("Child constructor called");
//	}
}

public class ChildInheritanceSerializableDemo {

	public static void main(String[] args) throws Exception {
		Charger c1=new Charger();
		c1.i=888;
		c1.j=999;
		FileOutputStream fos=new FileOutputStream("serializabe.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);

		FileInputStream fis=new FileInputStream("serializabe.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Charger c2=(Charger)ois.readObject();
		System.out.println(c2.i+"..."+c2.j);

	}

}
