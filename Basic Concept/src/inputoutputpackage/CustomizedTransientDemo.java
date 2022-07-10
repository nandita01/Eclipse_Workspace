package inputoutputpackage;
import java.io.*;
class Single implements Serializable
{
	String username="Vaishali";
	transient String pwd="Adwik";
	transient int pin=1234;
	public void write(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		int epin=9999+pin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	public void read(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
		int epin=is.readInt();
		pin=epin-4444;


	}
}

public class CustomizedTransientDemo {

	public static void main(String[] args)  throws Exception {
		Single s1=new Single();
		FileOutputStream fos=new FileOutputStream("serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);

		FileInputStream fis=new FileInputStream("serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Single s2=(Single)ois.readObject();
		System.out.println(s2.username+".."+s2.pwd+".."+s2.pin);


	}

}
