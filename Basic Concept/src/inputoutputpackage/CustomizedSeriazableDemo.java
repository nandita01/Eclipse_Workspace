package inputoutputpackage;
import java.io.*;
class Custom implements Serializable
{
	String username="Nandita";
	 transient String pwd="Adwik";
//	int a=200;
//	transient int b=300;
	}


public class CustomizedSeriazableDemo {
	
	public static void main(String[] args) throws Exception {
		Custom c1=new Custom();
		FileOutputStream fos=new FileOutputStream("serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
		FileInputStream fis=new FileInputStream("serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Custom c2=(Custom)ois.readObject();
	System.out.println(c2.username+"..."+c2.pwd);
//		System.out.println(c2.a+"..."+c2.b);

	}

}
